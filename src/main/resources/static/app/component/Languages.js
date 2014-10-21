/** @jsx React.DOM */

var Languages = React.createClass({
render: function() {
return (

<div>
<div className="rightpanel-item">
	<span className="language en"> English</span>
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
		<span title="Delete" className="action-ico ico-delete"></span>
	</div>
	<div className="clear"></div>
</div>

<div className="rightpanel-item">
	<span className="language cz"> Czech</span>
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
		<span title="Delete" className="action-ico ico-delete"></span>
	</div>
	<div className="clear"></div>
</div>

<button type="button" className="btn btn-warning btn-add">Add language</button>
</div>
);
}
});