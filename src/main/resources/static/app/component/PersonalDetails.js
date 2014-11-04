/** @jsx React.DOM */

var PersonAttribute = React.createClass({

getInitialState: function() {
	return {id: "", value: "", visibility: "", searchability: ""};
},
onChange: function(e) {
	this.setState({value: e.target.value});
},
load: function() {
	$.ajax({ url: "../person/1" + this.props.url, dataType: 'json',
	success: function(attribute) {
		this.setState({value: attribute.value, id: attribute.id, searchability: attribute.searchability, visibility: attribute.visibility});
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
update: function(id, data) {
	$.ajax({ url: ".." + this.props.url + id, dataType: 'json', type: 'PATCH', data : JSON.stringify(data) , headers : {'Accept' : 'application/json', 'Content-Type' : 'application/json'},
		success: function(result) {
		console.log(result);
		this.load();
	}.bind(this),
		error: function(xhr, status, err) {
		console.error(this.props.url, status, err.toString());
	}.bind(this)
	});
},
handleUpdate: function() {
	this.update(this.state.id, {value: this.state.value });
},
componentDidMount: function() {
	this.load();
},
render: function() {
	return (
		<div className="form-group">
			<label>{this.props.label} :</label>
			<input onChange={this.onChange} onBlur={this.handleUpdate} placeholder={this.props.label} className="form-control" value={this.state.value} type="text" />
			<VSDActions id={this.state.id} visibility={this.state.visibility} searchability={this.state.searchability} handleUpdate={this.update} />
		</div>
	);
}

});


var PersonalDetails = React.createClass({

render: function() {
return (

<div className="personalForm">



	<form className="" role="form">


		<PersonAttribute url="/firstName/" label="First name" />

		<div className="form-group">
			<label>First name:</label>
			<input type="text" placeholder="First Name" className="form-control" />

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
		</div>
		<div className="form-group">
			<label>Middle names:</label>
			<input type="text" placeholder="Middle Names" className="form-control"/>

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
		</div>
		<div className="form-group">
			<label>Last name:</label>
			<input type="text" placeholder="Last Name" className="form-control"/>

			<div className="dropdown-holder">
				<span title="Invisible" className="action-ico ico-invisible dropdown-toggle" data-toggle="dropdown"></span>
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
		</div>
		<div className="form-group">
			<label>Date of born:</label>
			<p className="input-group">
				<input type="text" className="form-control" datepicker-popup="yyyy/MM/dd" ng-model="dt" is-open="opened" show-weeks="false" datepicker-options="dateOptions" close-text="Close" />
                                    <span className="input-group-btn">
                                        <button type="button" className="btn btn-default" ng-click="open($event)"><i className="glyphicon glyphicon-calendar"></i></button>
                                    </span>
			</p>


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
		</div>
		<div className="form-group">
			<label>Nationality:</label>
			<div className="dropdown">
				<button className="btn btn-default dropdown-toggle" type="button" id="Button3" data-toggle="dropdown">
					Czech republic
					<span className="caret"></span>
				</button>
				<ul className="dropdown-menu dropdown-menu-right" role="menu" aria-labelledby="dropdownMenu1">
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">USA</a></li>
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Germany</a></li>
				</ul>
			</div>


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
		</div>
		<div className="form-group">
			<label>Gender:</label>
			<div className="dropdown">
				<button className="btn btn-default dropdown-toggle" type="button" id="Button4" data-toggle="dropdown">
					Male
					<span className="caret"></span>
				</button>
				<ul className="dropdown-menu dropdown-menu-right" role="menu" aria-labelledby="dropdownMenu1">
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Male</a></li>
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Female</a></li>
				</ul>
			</div>

			<div className="dropdown-holder">
				<span title="Visible in interviews" className="action-ico partial-visible dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>

			<div className="dropdown-holder">
				<span title="Not searchable" className="action-ico not-searchable  dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico searchable"></span>I am searchable by this</li>
					<li><span className="action-ico not-searchable"></span>I am NOT searchable by this</li>
				</ul>
			</div>

		</div>
		<div className="form-group">
			<label>Religion:</label>
			<div className="dropdown">
				<button className="btn btn-default dropdown-toggle" type="button" id="Button5" data-toggle="dropdown">
					Christianity
					<span className="caret"></span>
				</button>
				<ul className="dropdown-menu dropdown-menu-right" role="menu" aria-labelledby="dropdownMenu1">
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Christianity</a></li>
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Islam</a></li>
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Hinduism</a></li>
					<li role="presentation"><a role="menuitem" tabIndex="-1" href="#">Buddhism</a></li>
				</ul>
			</div>

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
		</div>

		<div className="clear"></div>


	</form>
</div>

);
}
});



