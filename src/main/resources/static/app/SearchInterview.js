/** @jsx React.DOM */

var SearchInterview = React.createClass({

render: function() {
return (

<div>
	<SearchConditions editable="true" searchTable="false" id="3" type="preferences"/>
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

render: function() {

var that = this;

return (
<div>


	<div className="search-condition-box">


		{this.state.conditions.map(function(row, index) {
		return (
		<div key={index}>
		<div className="search-condition-row">
			{row.map(function(cell, index) {
			return(
				<div key={cell.id} className="btn-group">

					<DropdownButton id="dropdownSearchCondition" onSelect={this.setVisibility} title={cell.searchConditionType} className="btn btn-item dropdown-toggle">
						<MenuItem key="PUBLICLY_VISIBLE">visible</MenuItem>
						<MenuItem key="VISIBLE_IN_INTERVIEW">visible in interviews</MenuItem>
						<MenuItem key="NOT_VISIBLE">invisible</MenuItem>
					</DropdownButton>


					<span className="btn btn-item skillName">{cell.x + "  " + cell.y + "  "}</span>
					<a href="javascript:void(0);" className="btn btn-item" ng-click="removeCondition(rowIndex,$index)"><span className="search-condition-remove"></span></a>

					{ index != that.state.conditions[cell.y].length -1 ? (<span><span className="search-condition-or">OR</span></span>) : null }
				</div>
			)

			;
			})}

			<span><button type="button" className="btn btn-warning btn-add" ng-click="addCondition(rowIndex)">Add</button></span>
		</div>

		{index != that.state.conditions.length -1 ? (<div className="searchConditionRowAnd"><span className="searchConditionRowAnd-btn">AND</span></div>) : null }

		</div>
		);
		})}


		<div className="searchConditionRowAdd rowAdd">
			<button className="btn btn-success btn-add" type="button" ng-click="addRow()">ADD ROW</button>
		</div>
	</div>

</div>

);
}
});

		
		