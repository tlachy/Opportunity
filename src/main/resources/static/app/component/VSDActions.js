/** @jsx React.DOM */

var VSDActions = React.createClass({

getInitialState: function() {
	return {visibility: this.props.visibility, searchability: this.props.searchability};
},

setVisibility: function(key) {
	this.state.visibility = key;
	this.props.handleUpdate(this.props.id, {visibility: key});
},

setSearchability: function(key) {
	this.state.searchability = key;
	this.props.handleUpdate(this.props.id, {searchability: key});
},
delete: function() {
	this.props.handleDelete(this.props.id);
},

render: function() {

	var visibilityClass = 'action-ico dropdown-toggle' +  this.state.visibility;
	var searchabilityClass = 'action-ico dropdown-toggle' +  this.state.searchability;
	console.log(this.props.handleDelete);



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

	{ this.props.handleDelete ? <input type="button" value="Delete" onClick={this.delete} className="action-ico ico-delete"/> : null }

</div>
);}});