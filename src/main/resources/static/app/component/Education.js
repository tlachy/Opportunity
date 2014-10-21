/** @jsx React.DOM */

var Education = React.createClass({
render: function() {
return (

<div>

	<div className="rightpanel-item">
		<span className="nowrap">Mgr.</span>
		<span className="nowrap">Informatics systems</span>
		<span className="nowrap">Masaryk university</span>
		<span className="nowrap">Brno</span>
		<span className="language cz">CZ</span>

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
		<span className="nowrap">Bc.</span>
		<span className="nowrap">Mathematics</span>
		<span className="nowrap">Masaryk university</span>
		<span className="nowrap">Brno</span>
		<span className="language cz">CZ</span>

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
		<span className="nowrap">High school</span>
		<span className="nowrap">Idustrial school</span>
		<span className="nowrap">Střední průmyslová škola</span>
		<span className="nowrap">Zlín</span>
		<span className="language cz">CZ</span>

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

	<button type="button" className="btn btn-warning btn-add">Add education</button>
</div>

);
}
});