/** @jsx React.DOM */

var JobsHistory = React.createClass({

getInitialState: function() {
	return { jobPositions: [] };
},
componentDidMount: function() {
	this.load();
},
load: function() {
	$.ajax({
		url: "../person/1/jobPosition", dataType: 'json',
		success: function(jobPositions) {
		this.setState( {jobPositions: jobPositions._embedded.jobPosition} );
	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../person/1/jobPosition", status, err.toString());
	}.bind(this)
	});
},
update: function(id, data) {
	$.ajax({ url: "../jobPosition/" + id, dataType: 'json', type: 'PATCH', data : JSON.stringify(data) , headers : {'Accept' : 'application/json', 'Content-Type' : 'application/json'},
		success: function(result) {
		console.log(result);
		this.load();
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
render: function() {

var jobPositions = this.state.jobPositions.map(function (jp) {

return (
		<JobsHistoryItem key={jp.id} jhi={jp}></JobsHistoryItem>
);
});

return (


<div className="job-history">
	<button type="button" className="btn btn-warning btn-add">ADD company to job history</button>

	{jobPositions}

	<button type="button" className="btn btn-warning btn-add">ADD Position in Company</button>

</div>

);
}
});



var JobsHistoryItem = React.createClass({

getInitialState: function() {
	return { jhi: this.props.jhi };
},

updateFromMonth: function(key){

},
updateFromYear: function(key){

},
updateToMonth: function(key){

},
updateToYear: function(key){

},

render: function() {

return (

<div className="job-history-item">
	<h3>Company:  <strong>{this.state.jhi.company}</strong></h3>
	<div className="jh-left">
		<DropdownButton onSelect={this.updateFromMonth} title={this.state.jhi.fromMonth}>
			<MenuItem key="1">1</MenuItem><MenuItem key="2">2</MenuItem><MenuItem key="3">3</MenuItem><MenuItem key="4">4</MenuItem><MenuItem key="5">5</MenuItem><MenuItem key="6">6</MenuItem><MenuItem key="7">7</MenuItem><MenuItem key="8">8</MenuItem><MenuItem key="9">9</MenuItem><MenuItem key="10">10</MenuItem><MenuItem key="11">11</MenuItem><MenuItem key="12">12</MenuItem>
		</DropdownButton>
		/
		<DropdownButton onSelect={updateFromYear} title={this.state.jhi.fromYear}>
			<MenuItem key="2015">2015</MenuItem><MenuItem key="2014">2014</MenuItem><MenuItem key="2013">2013</MenuItem><MenuItem key="2012">2012</MenuItem><MenuItem key="2011">2011</MenuItem><MenuItem key="2010">2010</MenuItem><MenuItem key="2009">2009</MenuItem>
		</DropdownButton>
		 -
		<DropdownButton onSelect={updateToMonth} title={this.state.jhi.toMonth}>
			<MenuItem key="1">1</MenuItem><MenuItem key="2">2</MenuItem><MenuItem key="3">3</MenuItem><MenuItem key="4">4</MenuItem><MenuItem key="5">5</MenuItem><MenuItem key="6">6</MenuItem><MenuItem key="7">7</MenuItem><MenuItem key="8">8</MenuItem><MenuItem key="9">9</MenuItem><MenuItem key="10">10</MenuItem><MenuItem key="11">11</MenuItem><MenuItem key="12">12</MenuItem>
		</DropdownButton>
		/
		<DropdownButton onSelect={updateToYear} title={this.state.jhi.toYear}>
			<MenuItem key="2015">2015</MenuItem><MenuItem key="2014">2014</MenuItem><MenuItem key="2013">2013</MenuItem><MenuItem key="2012">2012</MenuItem><MenuItem key="2011">2011</MenuItem><MenuItem key="2010">2010</MenuItem><MenuItem key="2009">2009</MenuItem>
		</DropdownButton>
		<br />

		{this.state.jhi.timeOnPositionInMonth}<br />
		<label>Type:</label> {this.state.jhi.positionType}
		<label>Language:</label> <span className="language cz">{this.state.jhi.workingLanguage}</span><br />
	</div>
	<div className="jh-right">
		<h4>
			<strong className="green">{this.state.jhi.position}</strong>  on  <strong>{this.state.jhi.project}</strong> project
		</h4>
		<p>
			{this.state.jhi.desc}
		</p>
		<p>
			{this.state.jhi.technologies}
		</p>
	</div>

	<div className="line"></div>
	<div className="clear"></div>

</div>


);
}
});



