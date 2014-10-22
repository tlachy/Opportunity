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
handleChange: function(change) {

},


render: function() {
	var speaksesNodes = this.state.speakses.map(function (speaks) {
			return (
				<Language key={speaks.id} url={speaks._links.language.href}><VSRActions callBack={this.handleChange} /></Language>
			);
		});
	return ( <div>
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
	<span className={classString} >{this.state.lang.nativ} ({this.state.lang.eng})</span>
	{this.props.children}
	<div className="clear"></div>
</div>

);
}
});



var VSRActions = React.createClass({

render: function() {
return (

<div className="actions">
	<div className="dropdown-holder">
		<span title="Visible" className="action-ico ico-visible dropdown-toggle" data-toggle="dropdown"></span>
		<ul className="dropdown-menu" role="menu">
			<li><span className="action-ico ico-visible"></span>visible</li>
			<li><span className="action-ico partial-visible"></span>visible in interviews</li>
			<li><span className="action-ico ico-invisible"></span>invisible</li>
		</ul>
	</div>
	<div className="dropdown-holder">
		<span title="Searchable" className="action-ico searchable  dropdown-toggle" data-toggle="dropdown"></span>
		<ul className="dropdown-menu" role="menu">
			<li><span className="action-ico searchable"></span>I am searchable by this</li>
			<li><span className="action-ico not-searchable"></span>I am NOT searchable by this</li>
		</ul>
	</div>
	<DropdownButton title="Dropdown">
		<MenuItem key="1"><span className="action-ico searchable"></span>I am searchable by this</MenuItem>
		<MenuItem key="2"><span className="action-ico not-searchable"></span>I am NOT searchable by this</MenuItem>
	</DropdownButton>

	<span title="Delete" className="action-ico ico-delete"></span>
</div>

);
}
});






