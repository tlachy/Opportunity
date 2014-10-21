/** @jsx React.DOM */

var JobsHistory = React.createClass({
render: function() {
return (


<div className="job-history">
	<h2>Job history: </h2>

	<button type="button" className="btn btn-warning btn-add">ADD company to job history</button>

	<div className="job-history-item">
		<h3>Company:  <strong>IBA CZ</strong></h3>
		<div className="jh-left">
			1.11.2011 - 8.12.2012<br />
			(22 monhts)<br />
			<label>Type:</label> REGULAR
			<label>Language:</label> <span className="language cz">CZ</span><br />
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
		</div>
		<div className="jh-right">
			<h4>
				<strong className="green">Java Developer</strong>  on  <strong>Human resources management and aplicant management system  </strong> project
			</h4>
			<p>
				Doc Hastings, protects and promotes hydropower resources by ending practices that diminish existing
				hydropower, cutting regulatory red-tape, generating new non-federal funding for new projects and
				improving transparency. Hydropower is a clean, renewable form of energy that accounts for 70 percent
				of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents
				200 million annual metric tons of carbon emissions.
			</p>
			<p>
				HTML/CSS, Javascript, jQuery, Flash, Python, Ruby, ASP.NET, Wordpress, Drupal, Joomla
			</p>
		</div>

		<div className="line"></div>

		<div className="jh-left">
			1.11.2011 - 8.12.2012<br />
			(22 monhts)<br />
			<label>Type:</label> REGULAR
			<label>Language:</label> <span className="language cz">CZ</span><br />
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
		</div>
		<div className="jh-right">
			<h4>
				<strong className="green">Java Developer</strong>  on  <strong>Aplicant management system  </strong> project
			</h4>
			<p>
				Hydropower is a clean, renewable form of energy that accounts for 70 percent
				of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents
				200 million annual metric tons of carbon emissions.
			</p>
			<p>
				PHP, Nette, Flash, Python, Ruby, ASP.NET, Wordpress, Drupal, Joomla
			</p>
		</div>
		<div className="clear"></div>

		<button type="button" className="btn btn-warning btn-add">ADD Position in Company</button>

	</div>

	<div className="job-history-item">
		<h3>Company:  <strong>Iholding s.r.o.</strong></h3>
		<div className="jh-left">
			21.2.2010 - 2.11.2011<br />
			(5 monhts)<br />
			<label>Type:</label> REGULAR
			<label>Language:</label> <span className="language en">EN</span><br />
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
		</div>
		<div className="jh-right">
			<h4>
				<strong className="green">HTML Coder</strong>  on  <strong>Web developing</strong> project
			</h4>
			<p>
				Washington state, seven percent of electricity generated in the U.S. and prevents
				200 million annual metric tons of carbon emissions.
			</p>
			<p>
				HTML/CSS, Javascript, jQuery
			</p>
		</div>

		<div className="clear"></div>


		<button type="button" className="btn btn-warning btn-add">ADD Position in Company</button>

	</div>




</div>

);
}
});

