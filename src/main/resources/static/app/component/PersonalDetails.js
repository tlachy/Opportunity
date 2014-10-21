/** @jsx React.DOM */

var PersonalDetails = React.createClass({
render: function() {
return (

<div className="personalForm">
	<form className="" role="form">
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