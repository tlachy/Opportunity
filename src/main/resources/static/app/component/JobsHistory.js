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
render: function() {

var jobPositions = this.state.jobPositions.map(function (jp) {

return (

<div key={jp.id} className="job-history-item">
	<h3>Company:  <strong>{jp.company}</strong></h3>
	<div className="jh-left">
		{jp.fromMonth}/{jp.fromYear} - {jp.toMonth}/{jp.toYear}<br />
		{jp.timeOnPositionInMonth}<br />
		<label>Type:</label> {jp.positionType}
		<label>Language:</label> <span className="language cz">{jp.workingLanguage}</span><br />
	</div>
	<div className="jh-right">
		<h4>
			<strong className="green">{jp.position}</strong>  on  <strong>{jp.project}</strong> project
		</h4>
		<p>
			{jp.desc}
		</p>
		<p>
			{jp.technologies}
		</p>
	</div>

	<div className="line"></div>

	<div className="clear"></div>


</div>

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

