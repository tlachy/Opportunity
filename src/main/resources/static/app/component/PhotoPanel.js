/** @jsx React.DOM */

var PhotoPanel = React.createClass({
render: function() {
return (

<div className="photoPanel">
	<div className="photo-holder">
		<img src="../../images/user.jpg" alt="User photo"/>
		<button type="button" className="btn btn-warning photo-button"><span className="glyphicon glyphicon-refresh"></span> Change photo</button>
		<div className="action-part">
			<div className="dropdown-holder">
				<span title="Visible" className="action-ico ico-visible dropdown-toggle"></span>
				<ul className="dropdown-menu">
					<li><span className="action-ico ico-visible"></span>visible</li>
					<li><span className="action-ico partial-visible"></span>visible in interviews</li>
					<li><span className="action-ico ico-invisible"></span>invisible</li>
				</ul>
			</div>
			<span title="Delete" className="action-ico ico-delete"></span>
		</div>
	</div>
</div>

);
}
});


