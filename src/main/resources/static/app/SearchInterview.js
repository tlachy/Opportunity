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

conds[0] = [response._embedded.searchCondition[0]];
conds[1] = [response._embedded.searchCondition[1], response._embedded.searchCondition[2] ]

this.setState({conditions: conds });

}.bind(this),
error: function(xhr, status, err) {
console.error("../language", status, err.toString());
}.bind(this)
});
},

render: function() {

var data = [[1,2,3],[4,5,6],[7,8,9]];


return (
<div>


	<div className="search-condition-box">


		{this.state.conditions.map(function(row, index) {
		return (
		<div key={index} className="search-condition-row">
			{row.map(function(cell, index) {
			return(
			<div key={index}>
			<div className="btn-group">

				<div className="btn-group">
					<button type="button" id="dropdownSearchCondition" className="btn btn-item dropdown-toggle" data-toggle="dropdown">
						label
						<span className="caret"></span>
					</button>
					<ul className="dropdown-menu" role="menu">
						<li><a href="javascript:void(0);" ng-click="openConditionDialog(rowIndex,$index,option)"> label </a></li>
					</ul>
				</div>
				<span className="btn btn-item skillName">value</span>
				<a href="javascript:void(0);" className="btn btn-item" ng-click="removeCondition(rowIndex,$index)"><span className="search-condition-remove"></span></a>

			</div>


			<span ng-repeat-end ng-hide="$last">
					<span className="search-condition-or">OR</span>
			</span>
			</div>)

			;
			})}

		<span><button type="button" className="btn btn-warning btn-add" ng-click="addCondition(rowIndex)">Add</button></span>
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

		
		