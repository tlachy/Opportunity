/** @jsx React.DOM */

var Header = React.createClass({
  render: function() {
    return (

      <div>
        <div className="navbar navbar-inverse navbar-fixed-top">
            <div className="container">
                <div className="navbar-collapse collapse">
                    <form className="navbar-form navbar-right">
                        <label>hr@company.com</label>
                        <button type="submit" className="btn btn-success">Sign out</button>
                    </form>
                </div>
            </div>
        </div>
        <br/><br/><br/><br/>
        </div>

    );
  }
});
