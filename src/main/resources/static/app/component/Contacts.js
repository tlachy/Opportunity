/** @jsx React.DOM */

var Contacts = React.createClass({
render: function() {
return (

<div>
	<div className="rightpanel-item">
		<span className="contact"><span className="ico skype"></span>tlachynek</span>
		<div className="actions">
			<div className="dropdown-holder">
				<span title="Visible" className="action-ico ico-visible dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>

			<span title="Delete" className="action-ico ico-delete"></span>
		</div>
		<div className="clear"></div>
	</div>

	<div className="rightpanel-item">
		<span className="contact"><span className="ico email"></span> tlachy@seznam.cz</span>
		<div className="actions">
			<div className="dropdown-holder">
				<span title="Visible" className="action-ico ico-visible dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>

			<span title="Delete" className="action-ico ico-delete"></span>
		</div>
		<div className="clear"></div>
	</div>

	<div className="rightpanel-item">
		<span className="contact"><span className="ico email"></span> martin.tlachac@gmail.com</span>
		<div className="actions">
			<div className="dropdown-holder">
				<span title="Visible" className="action-ico ico-visible dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>

			<span title="Delete" className="action-ico ico-delete"></span>
		</div>
		<div className="clear"></div>
	</div>

	<div className="rightpanel-item">
		<span className="contact"><span className="ico phone"></span> +420 774 111 233</span>
		<div className="actions">
			<div className="dropdown-holder">
				<span title="Visible" className="action-ico ico-visible dropdown-toggle" data-toggle="dropdown"></span>
				<ul className="dropdown-menu" role="menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>

			<span title="Delete" className="action-ico ico-delete"></span>
		</div>
		<div className="clear"></div>
	</div>

	<button type="button" className="btn btn-warning btn-add">Add contact</button>
</div>

);
}
});

