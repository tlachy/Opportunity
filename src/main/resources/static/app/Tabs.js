/** @jsx React.DOM */

var Tabs = React.createClass({
render: function() {
  return (

      <TabbedArea className="masthead" defaultActiveKey={ GetURLParameter('tab', 1) } >
            <TabPane key={1} tab="Profile"> <PersonProfile /> </TabPane>
            <TabPane key={2} tab="Search for interview">TabPane 2 content</TabPane>
            <TabPane key={3} tab="Interviews">TabPane 3 content</TabPane>
            <TabPane key={4} tab="Documents">TabPane 4 content</TabPane>
            <TabPane key={5} tab="History">TabPane 5 content</TabPane>
      </TabbedArea>
  );
}
});

