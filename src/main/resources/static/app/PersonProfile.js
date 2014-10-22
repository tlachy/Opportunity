/** @jsx React.DOM */

var PersonProfile = React.createClass({
render: function() {
  return (

  <div id="profileContainer">
    <div className="leftPanel">

        <h2>Personal details:</h2>
        <PhotoPanel />
        <PersonalDetails />

        <div className="clear"></div>


        <h2>Jobs history: </h2>
        <JobsHistory />

    </div>

    <div className="rightPanel">

        <button type="button" className="btn btn-success btn-export"><span className="glyphicon glyphicon-export"></span> Export profile as CV</button>

        <h2> Education: </h2>
		  <Education />

        <h2> Languages: </h2>
		<SpokenLanguages url="../persons/1/speaks" />

        <h2> Contacts: </h2>
        <Contacts />

    </div>

	  <div className="clear"></div>

  </div>
  );
}
});