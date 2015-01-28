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
console.log("called 0");
var that = this;

var jobPositions = this.state.jobPositions.map(function (jp) {

return (
		<JobsHistoryItem key={jp.id} jhi={jp} update={that.update}></JobsHistoryItem>
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
	return {id: this.props.jhi.id, fromMonth: this.props.jhi.fromMonth, fromYear: this.props.jhi.fromYear, toMonth: this.props.jhi.toMonth, toYear: this.props.jhi.toYear,
	positionType: this.props.jhi.positionType, workingLanguage: this.props.jhi.workingLanguage, position: this.props.jhi.position, project: this.props.jhi.project, desc: this.props.jhi.desc,
	technologies: this.props.jhi.technologies };
},

updateFromMonth: function(key){
	this.props.update(this.props.jhi.id, {fromMonth : key} );
	this.setState({fromMonth : key});
},
updateFromYear: function(key){
	this.props.update(this.props.jhi.id, {fromYear : key} );
	this.setState({fromYear : key});
},
updateToMonth: function(key){
	this.props.update(this.props.jhi.id, {toMonth : key} );
	this.setState({toMonth : key});
},
updateToYear: function(key){
	this.props.update(this.props.jhi.id, {toYear : key} );
	this.setState({toYear : key});
},
changePosition: function(e){
	this.setState({position : e.target.value});
},

render: function() {

var that = this;

return (

<div className="job-history-item">
	<h3>Company:  <strong>{this.state.company}</strong></h3>
	<div className="jh-left">
		<DropdownButton onSelect={this.updateFromMonth} title={this.state.fromMonth}>
			<MenuItem key="1">1</MenuItem><MenuItem key="2">2</MenuItem><MenuItem key="3">3</MenuItem><MenuItem key="4">4</MenuItem><MenuItem key="5">5</MenuItem><MenuItem key="6">6</MenuItem><MenuItem key="7">7</MenuItem><MenuItem key="8">8</MenuItem><MenuItem key="9">9</MenuItem><MenuItem key="10">10</MenuItem><MenuItem key="11">11</MenuItem><MenuItem key="12">12</MenuItem>
		</DropdownButton>
		/
		<DropdownButton onSelect={this.updateFromYear} title={this.state.fromYear}>
			<MenuItem key="2015">2015</MenuItem><MenuItem key="2014">2014</MenuItem><MenuItem key="2013">2013</MenuItem><MenuItem key="2012">2012</MenuItem><MenuItem key="2011">2011</MenuItem><MenuItem key="2010">2010</MenuItem><MenuItem key="2009">2009</MenuItem>
		</DropdownButton>
		 -
		<DropdownButton onSelect={this.updateToMonth} title={this.state.toMonth}>
			<MenuItem key="1">1</MenuItem><MenuItem key="2">2</MenuItem><MenuItem key="3">3</MenuItem><MenuItem key="4">4</MenuItem><MenuItem key="5">5</MenuItem><MenuItem key="6">6</MenuItem><MenuItem key="7">7</MenuItem><MenuItem key="8">8</MenuItem><MenuItem key="9">9</MenuItem><MenuItem key="10">10</MenuItem><MenuItem key="11">11</MenuItem><MenuItem key="12">12</MenuItem>
		</DropdownButton>
		/
		<DropdownButton onSelect={this.updateToYear} title={this.state.toYear}>
			<MenuItem key="2015">2015</MenuItem><MenuItem key="2014">2014</MenuItem><MenuItem key="2013">2013</MenuItem><MenuItem key="2012">2012</MenuItem><MenuItem key="2011">2011</MenuItem><MenuItem key="2010">2010</MenuItem><MenuItem key="2009">2009</MenuItem>
		</DropdownButton>
		<br />

		{this.state.timeOnPositionInMonth}<br />
		<label>Type:</label> {this.state.positionType}
		<label>Language:</label> <span className="language ces">{this.state.workingLanguage}</span><br />
	</div>
	<div className="jh-right">
		<h4>
				<input className="green" onChange={function(e){that.setState({position : e.target.value});}} placeholder="Position" value={this.state.position} type="text"
					   onBlur={function(e){that.props.update(that.props.jhi.id,  {position : that.state.position});}} />
			on

				<input onChange={function(e){that.setState({project : e.target.value});}} placeholder="Project name" value={this.state.project} type="text"
				onBlur={function(e){that.props.update(that.props.jhi.id,  {project : that.state.project});}} />
			project
		</h4>
		<p>

			<textarea onkeyup={function(e){  e.target.style.height = "1px"; setTimeout(function() { e.target.style.height = (e.target.scrollHeight)+"px"; }, 1); }} onChange={function(e){that.setState({desc : e.target.value});}} placeholder="Project name" value={this.state.desc}
			onBlur={function(e){that.props.update(that.props.jhi.id,  {desc : that.state.desc});}} ></textarea>
		</p>
		<p>
			<textarea  onChange={function(e){that.setState({technologies : e.target.value});}} placeholder="Technologies used separated by space" value={this.state.technologies} type="text"
			onBlur={function(e){that.props.update(that.props.jhi.id,  {technologies : that.state.technologies});}} ></textarea>
		</p>
	</div>

	<div className="line"></div>
	<div className="clear"></div>

</div>


);
}
});



