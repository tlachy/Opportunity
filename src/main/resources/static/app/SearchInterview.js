/** @jsx React.DOM */

var SearchInterview = React.createClass({

getInitialState: function() {
	return { search: {}, preferences: {}, savedSearches: [] };
},

componentDidMount: function() {
	this.load();
},

load: function() {
	$.ajax({ url: "../person/1/jobSearch", dataType: 'json',
	success: function(response) {

		$.each(response._embedded.jobSearch, function( index, jobSearch ) {

			if( jobSearch.jobSearchType == 'USER_PREFERENCES'){
				this.state.search = jobSearch;
				return true;
			}
			if( jobSearch.jobSearchType == 'USER_SEARCH'){
				this.state.preferences = jobSearch;
				return true;
			}
			if( jobSearch.jobSearchType == 'USER_SAVED_SEARCH'){
				this.state.savedSearches.push(jobSearch);
				return true;
			}
			console.log("There is unrecognized type of job search with id: " + jobSearch.id + " of user with id: " + this.props.userId);
		});
		this.forceUpdate();

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
	{jQuery.isEmptyObject({})}
	<SearchConditions editable="false" searchTable="false" jobSearchId={this.state.preferences.id} />
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

getInitialState: function() {
	return { conditions: [[]] };
},

componentDidMount: function() {
	this.load();
},

load: function() {
	$.ajax({ url: "../jobSearch/1/searchCondition", dataType: 'json',
	success: function(response) {

		var conds = [[]];

		conds[0] = [response._embedded.searchCondition[0], response._embedded.searchCondition[1]];
		conds[1] = [response._embedded.searchCondition[2] ]

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

					<DropdownButton id="dropdownSearchCondition" onSelect={this.setVisibility} title={cell.searchConditionType} className="btn btn-item dropdown-toggle">
						<MenuItem key="PUBLICLY_VISIBLE">visible</MenuItem>
						<MenuItem key="VISIBLE_IN_INTERVIEW">visible in interviews</MenuItem>
						<MenuItem key="NOT_VISIBLE">invisible</MenuItem>
					</DropdownButton>


					<span className="btn btn-item skillName">{cell.x + "  " + cell.y + "  "}</span>
					<a href="javascript:void(0);" className="btn btn-item" onClick={ function(){ that.delete(cell)}} ><span className="search-condition-remove"></span></a>

					{ columnIndex != that.state.conditions[cell.y].length -1 ? (<span><span className="search-condition-or">OR</span></span>) : null }
				</div>
			);})}
			<span><Button onClick={ function(){ that.save({ x: that.state.conditions[rowIndex].length , y: rowIndex  }, rowIndex)}} bsStyle="warning">ADD</Button></span>
		</div>

		{rowIndex != that.state.conditions.length -1 ? (<div className="searchConditionRowAnd"><span className="searchConditionRowAnd-btn">AND</span></div>) : null }

		</div>
		);})}

		<div className="searchConditionRowAdd rowAdd">
			<Button onClick={ function(){  that.save(  {x:0, y: that.state.conditions.length})}} bsStyle="success">ADD ROW</Button>
		</div>
	</div>

</div>

);
}
});

		
		