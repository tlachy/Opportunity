/** @jsx React.DOM */

var SpokenLanguages = React.createClass({

getInitialState: function() {
	return {speakses: []};
},
componentDidMount: function() {
	this.loadCommentsFromServer();
},

loadCommentsFromServer: function() {
	$.ajax({
	url: this.props.url,
	dataType: 'json',
	success: function(speakses) {
	this.setState({speakses: speakses._embedded.speakses});
	}.bind(this),
	error: function(xhr, status, err) {
	console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
handle: function(action) {
	console.log(action);
},


render: function() {
var handleFunc = this.handle;
var speaksesNodes = this.state.speakses.map(function (speaks) {
return (
<Language key={speaks.id} url={speaks._links.language.href}>
	<VSRActions visibility="neco" searchability="neco" handleAction={handleFunc} />
</Language>
);
});
return (
<div>
	{speaksesNodes}
	<button type="button" className="btn btn-warning btn-add">Add language</button>
</div>

);
}
});


var Language = React.createClass({

getInitialState: function() {
return {lang: {}};
},
loadCommentsFromServer: function() {
$.ajax({
url: this.props.url,
dataType: 'json',
success: function(language) {
this.setState({lang: language});
}.bind(this),
error: function(xhr, status, err) {
console.error(this.props.url, status, err.toString());
}.bind(this)
});
},
componentDidMount: function() {
this.loadCommentsFromServer();
},

render: function() {

var classString = 'language ' +  this.state.lang.id1;

return (
<div className="rightpanel-item">
	<span className={classString}>{this.state.lang.nativ} ({this.state.lang.eng})</span>
	{this.props.children}
	<div className="clear"></div>
</div>

);
}
});


var VSRActions = React.createClass({

getInitialState: function() {
	return {visibility: this.props.visibility, searchability: this.props.searchability};
},

setVisibility: function(key) {
	this.state.visibility = key;
	this.props.handleAction(key);

},
setSearchability: function(key) {
	this.state.searchability = key;
    this.props.handleAction(key);

},
handleDelete: function(){
	this.props.handleAction('DELETE');
},


render: function() {

var visibilityClass = 'action-ico dropdown-toggle' +  this.state.visibility;
var searchabilityClass = 'action-ico dropdown-toggle' +  this.state.searchability;

return (

<div className="actions">

	<DropdownButton onSelect={this.setVisibility} className={visibilityClass}>
		<MenuItem key="PUBLICLY_VISIBLE"><span className="action-ico ico-visible"></span>visible</MenuItem>
		<MenuItem key="VISIBLE_IN_INTERVIEW"><span className="action-ico partial-visible"></span>visible in interviews</MenuItem>
		<MenuItem key="NOT_VISIBLE"><span className="action-ico ico-invisible"></span>invisible</MenuItem>
	</DropdownButton>

	<DropdownButton onSelect={this.setSearchability} className={searchabilityClass}>
		<MenuItem key="SEARCHABLE"><span className="action-ico searchable"></span>I am searchable by this</MenuItem>
		<MenuItem key="NOT_SEARCHABLE"><span className="action-ico not-searchable"></span>I am NOT searchable by this</MenuItem>
	</DropdownButton>

	<input type="button" value="Delete" onClick={this.handleDelete} className="action-ico ico-delete"/>

</div>

);
}
});






