<%@taglib uri="/struts-dojo-tags" prefix="ajax"%>
<!-- This head tag should be used in order to load java script files in our application -->
<ajax:head/>
<!-- This ajax dojo's are used for loading the page without need to reload the url once we click on different tabs in the menu -->
<ajax:tabbedpanel id="main" closeButton="true">

<ajax:div label="HOME" closable="true">
<pre>
Home page is being displayes in this page</pre>
</ajax:div>

<ajax:div label="ABOUT" closable="true">
<pre>
About page is being displayes in this page</pre>
</ajax:div>

<ajax:div label="CONTACT" closable="true">
<pre>
Contact page is being displayes in this page</pre>
</ajax:div>
 </ajax:tabbedpanel>