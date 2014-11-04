/** @jsx React.DOM */

var SpokenLanguages = React.createClass({

mixins: [OverlayMixin],

getInitialState: function() {
	return { spokenLanguages: [], languages: [], newSpokenLanguage: {languageLevel: "", person: "../person/1", language: {}}, isModalOpen: false };
},
componentDidMount: function() {
	this.loadSpokenLanguages();
	this.loadLanguages();
},
handleToggle: function () {
	this.setState( {isModalOpen: !this.state.isModalOpen});
},
addSpokenLanguage: function () {
	this.saveSpokenLanguage( this.state.newSpokenLanguage );
	this.handleToggle();
},
loadLanguages: function() {
	$.ajax({
		url: "../language", dataType: 'json',
		success: function(langs) {
			this.setState({languages: langs._embedded.languages});
	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../language", status, err.toString());
	}.bind(this)
	});
},
loadSpokenLanguages: function() {
	$.ajax({
		url: this.props.url, dataType: 'json',
		success: function(spokenLangs) {
			jQuery.isEmptyObject(spokenLangs) ? this.setState( {spokenLanguages: []}) : this.setState({spokenLanguages: spokenLangs._embedded.spokenLanguage});
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
deleteSpokenLanguage: function(id) {
	$.ajax({ url: "../spokenLanguage/" + id, dataType: 'json', type: 'DELETE',
	success: function(result) {
		console.log(result);
		this.loadSpokenLanguages();
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
updateSpokenLanguage: function(id, data) {
	$.ajax({ url: "../spokenLanguage/" + id, dataType: 'json', type: 'PATCH', data : JSON.stringify(data) , headers : {'Accept' : 'application/json', 'Content-Type' : 'application/json'},
		success: function(result) {
		console.log(result);
		this.loadSpokenLanguages();
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
saveSpokenLanguage: function(data) {
	$.ajax({ url: "../spokenLanguage", dataType: 'json', type: 'POST', data : JSON.stringify(data) , headers : {'Accept' : 'application/json', 'Content-Type' : 'application/json'},
		success: function(result) {
		console.log(result);
		this.loadSpokenLanguages();
	}.bind(this),
		error: function(xhr, status, err) {
		console.error("../spokenLanguage", status, err.toString());
	}.bind(this)
	});
},

render: function() {
	var that = this;

	var spokenLanguagesNodes = this.state.spokenLanguages.map(function (sl) {

		return (
		<Language key={sl.id} url={sl._links.language.href}>
			<DropdownButton bsStyle="default" onSelect={function(key){ that.updateSpokenLanguage(sl.id, {languageLevel: key});  }} title={sl.languageLevel}>
				<MenuItem key="A1">A1</MenuItem>
				<MenuItem key="A2">A2</MenuItem>
				<MenuItem key="B1">B1</MenuItem>
				<MenuItem key="B2">B2</MenuItem>
				<MenuItem key="C1">C1</MenuItem>
				<MenuItem key="C2">C2</MenuItem>
				<MenuItem key="NATIVE">NATIVE</MenuItem>
			</DropdownButton>
			<VSDActions id={sl.id} visibility={sl.visibility} searchability={sl.searchability} handleDelete={that.deleteSpokenLanguage} handleUpdate={that.updateSpokenLanguage} />
		</Language>
		);
	});
	return (
		<div>
			{spokenLanguagesNodes}
			<Button onClick={this.handleToggle} bsStyle="warning">Add language</Button>
		</div>

	);
},
renderOverlay: function () {
	if (!this.state.isModalOpen) {
		return <span/>;
	}
	var that = this;

	var langsNodes = this.state.languages.map(function (lang) {
			var classString = 'language ' + lang.id1;
			return (<MenuItem key={lang.id} onSelect={function(key){  that.state.newSpokenLanguage.language = lang;  that.forceUpdate();  }}>
						<span className={classString}></span>{lang.nativ} ({lang.eng})
					</MenuItem> );
	});

	return (
		<Modal title="Add language" onRequestHide={this.handleToggle}>

			<div className="modal-body">
				<DropdownButton bsStyle="default" onSelect={function(key){  that.state.newSpokenLanguage.languageLevel = key;  that.forceUpdate(); }}  title={this.state.newSpokenLanguage.languageLevel}>
					<MenuItem key="A1">A1</MenuItem>
					<MenuItem key="A2">A2</MenuItem>
					<MenuItem key="B1">B1</MenuItem>
					<MenuItem key="B2">B2</MenuItem>
					<MenuItem key="C1">C1</MenuItem>
					<MenuItem key="C2">C2</MenuItem>
					<MenuItem key="NATIVE">NATIVE</MenuItem>
				</DropdownButton>
				<DropdownButton bsStyle="default" title="Select a lang">
					{langsNodes}
				</DropdownButton>
			</div>

			<div className="modal-footer">
				<Button onClick={this.addSpokenLanguage}>Add</Button>
				<Button onClick={this.handleToggle}>Close</Button>
			</div>
		</Modal>
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