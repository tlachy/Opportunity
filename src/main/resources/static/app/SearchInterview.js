/** @jsx React.DOM */

var SearchInterview = React.createClass({

getInitialState: function() {
	return { search: {}, preferences: {}, savedSearches: [] };
},

componentDidMount: function() {
	this.load();
},

load: function() {
	var that = this;

	$.ajax({ url: "../person/1/jobSearch", dataType: 'json',
	success: function(response) {

		$.each(response._embedded.jobSearch, function( index, jobSearch ) {

			if( jobSearch.jobSearchType == 'USER_PREFERENCES'){
				that.state.search = jobSearch;
				return true;
			}
			if( jobSearch.jobSearchType == 'USER_SEARCH'){
				that.state.preferences = jobSearch;
				return true;
			}
			if( jobSearch.jobSearchType == 'USER_SAVED_SEARCH'){
				that.state.savedSearches.push(jobSearch);
				return true;
			}
			console.log("There is unrecognized type of job search with id: " + jobSearch.id + " of user with id: " + that.props.userId);
		});
		that.forceUpdate();

	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../language", status, err.toString());
	}.bind(this)
	});
},

render: function() {
return (

<div>

	<h2>Preferences:</h2>
	{jQuery.isEmptyObject(this.state.search)  ? <span/> :
	<SearchConditions editable="false" searchTable="false" jobSearchId={this.state.preferences.id} />  }

	<h2>Search:</h2>
	<SearchConditions editable="true" searchTable="true" jobSearchId={this.state.search.id} />


	<h2>Saved searches:</h2>
	{this.state.savedSearches.map(function( savedSearch, columnIndex) {
		<SearchConditions editable="false" searchTable="true" jobSearchId={savedSearch.id} />
	})}

</div>

);
}
});


var SearchConditions = React.createClass({

mixins: [OverlayMixin],

getInitialState: function() {
	return { conditions: [[]], isModalOpen: false, selectedCondition: {}, selectedType: "" };
},
componentDidMount: function() {
	this.load();
},
load: function() {
	$.ajax({ url: "../jobSearch/1/searchCondition", dataType: 'json',
	success: function(response) {

		var conds = [[]];

		response._embedded.searchCondition.forEach(function(condition){   								// create table according to x and y
			if (typeof conds[condition.y] == "undefined") {
				conds[condition.y] = [condition];
			} else {
				conds[condition.y].push(condition);
			}
		});
		conds.forEach(function(row){																	// sort rows ascendingly according to x
			row.sort(function(condition1, condition2){ return condition1.x - condition2.x });
		});

		this.setState({conditions: conds });

	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../language", status, err.toString());
	}.bind(this)
	});
},
save: function(data, rowIndex) {
	data.jobSearch = "../jobSearch/"+ this.props.jobSearchId;

	$.ajax({ url: "../searchCondition", dataType: 'json', type: 'POST', data : JSON.stringify(data) , headers : {'Accept' : 'application/json', 'Content-Type' : 'application/json'},
		success: function(result) {
		console.log(result);

		if(typeof rowIndex !== 'undefined'){
			this.state.conditions[rowIndex].push(result);
		} else {
			this.state.conditions.push([result])
		}
		this.forceUpdate();

	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../jobSearch/1/searchCondition", status, err.toString());
	}.bind(this)
	});
},
delete: function( searchCondition ) {
	$.ajax({ url: "../searchCondition/" + searchCondition.id, dataType: 'json', type: 'DELETE',
		success: function(result) {
		console.log(result);
		this.state.conditions[searchCondition.y].splice(searchCondition.x, 1);
		this.forceUpdate();

	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
openCondModal: function(condition) {
	this.setState({selectedCondition: condition,  isModalOpen: !this.state.isModalOpen});
	console.log(condition);
},



render: function() {

var that = this;

return (
<div>

	<div className="search-condition-box">

		{this.state.conditions.map(function(row, rowIndex) {
		return (
		<div key={rowIndex}>
		<div className="search-condition-row">
			{row.map(function(cell, columnIndex) {
			return(
				<div key={cell.id} className="btn-group">

					<DropdownButton id="dropdownSearchCondition" onSelect={ function(key){  cell.type = key; that.openCondModal(cell)}} title={cell.searchConditionType} className="btn btn-item dropdown-toggle">
						<MenuItem key="LOCATION">LOCATION</MenuItem>
						<MenuItem key="SKILL">SKILL</MenuItem>
						<MenuItem key="YEARS_OF_EXPS">YEARS_OF_EXPS</MenuItem>
						<MenuItem key="AGE">AGE</MenuItem>
						<MenuItem key="SALARY">SALARY</MenuItem>
						<MenuItem key="HOME_OFFICE">HOME_OFFICE</MenuItem>
						<MenuItem key="TYPE_OF_CONTRACT">TYPE_OF_CONTRACT</MenuItem>
						<MenuItem key="DISABLED">DISABLED</MenuItem>
						<MenuItem key="LANGUAGE">LANGUAGE</MenuItem>
						<MenuItem key="AVAILABILITY">AVAILABILITY</MenuItem>
						<MenuItem key="DISTANCE_TO_WORK">DISTANCE_TO_WORK</MenuItem>
						<MenuItem key="WORK_FOR_BANK">WORK_FOR_BANK</MenuItem>
						<MenuItem key="TRAVELLING">TRAVELLING</MenuItem>
						<MenuItem key="RELIGION">RELIGION</MenuItem>
						<MenuItem key="ORIENTATION">ORIENTATION</MenuItem>
						<MenuItem key="GENDRE">GENDRE</MenuItem>
						<MenuItem key="NATIONALITY">NATIONALITY</MenuItem>
					</DropdownButton>


					<span className="btn btn-item skillName">{cell.x + "  " + cell.y + "  "}</span>
					<a href="javascript:void(0);" className="btn btn-item" onClick={ function(){ that.delete(cell)}} ><span className="search-condition-remove"></span></a>

					{ columnIndex != that.state.conditions[cell.y].length -1 ? (<span><span className="search-condition-or">OR</span></span>) : null }
				</div>
			);})}
			<span><Button onClick={ function(){ that.save({ x: that.state.conditions[rowIndex].length , y: rowIndex  }, rowIndex)}} className="btn-add" bsStyle="warning">ADD</Button></span>
		</div>

		{rowIndex != that.state.conditions.length -1 ? (<div className="searchConditionRowAnd"><span className="searchConditionRowAnd-btn">AND</span></div>) : null }

		</div>
		);})}

		<div className="searchConditionRowAdd rowAdd">
			<Button onClick={ function(){  that.save(  {x:0, y: that.state.conditions.length})}} className="btn-add" bsStyle="success">ADD ROW</Button>
		</div>
	</div>

</div>

);
},



renderOverlay: function () {

console.log("render overlay called");

if (!this.state.isModalOpen) {
	return <span/>;
}
var that = this;

return (
<Modal title="Add language" onRequestHide={this.openCondModal}>

	<div className="modal-body">
		<LanguageCondition condition={this.state.selectedCondition} close={this.openCondModal} save={this.openCondModal}  />
	</div>
</Modal>

);
}
});


var LanguageCondition = React.createClass({

getInitialState: function() {
	return { condition : this.props.condition };
},
ok: function() {
	this.state.condition.stringValue1 = "aaaa";
	this.props.save(this.state.condition);
},
close: function(){
	this.props.close(null);
},
select: function(key){
	this.condition.stringValue1 = key;
},


render: function() {
console.log("render called");
return (
	<div>
	{this.props.condition.searchConditionType}
	<DropdownButton  onSelect={this.openCondModal} title={"neco"} className="btn btn-item dropdown-toggle">
    						<MenuItem key="en">LOCATION</MenuItem>
    						<MenuItem key="cz">SKILL</MenuItem>
    </DropdownButton>
    <div>
    		<Button onClick={this.ok}>OK</Button>
    		<Button onClick={this.close}>Close</Button>
    </div>
    </div>
);
}
});