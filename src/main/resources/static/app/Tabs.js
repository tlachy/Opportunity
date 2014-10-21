/** @jsx React.DOM */

var Tabs = React.createClass({
render: function() {
  return (

      <TabbedArea defaultActiveKey={ GetURLParameter('tab', 1) } >
            <TabPane key={1} tab="Profile"> <PersonProfile /> </TabPane>
            <TabPane key={2} tab="Tab 2">TabPane 2 content</TabPane>
            <TabPane key={3} tab="Tab 3">TabPane 3 content</TabPane>
            <TabPane key={4} tab="Tab 4">TabPane 4 content</TabPane>
            <TabPane key={5} tab="Tab 5">TabPane 5 content</TabPane>
            <TabPane key={6} tab="Tab 6">TabPane 6 content</TabPane>
          </TabbedArea>
  );
}
});

