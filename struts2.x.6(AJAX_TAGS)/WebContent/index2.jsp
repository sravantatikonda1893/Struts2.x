<%@taglib uri="/struts-dojo-tags" prefix="ajax"%>
<!-- This head tag should be used in order to load java script files in our application -->
<ajax:head/>
<!-- This ajax dojo's are used for loading the page without need to reload the url once we click on different tabs in the menu -->
<ajax:tabbedpanel id="main"> 
<ajax:div label="REG">
<ajax:autocompleter label="select state" list="{'TG','AP','GOA','TN','KA'}"></ajax:autocompleter>
<ajax:datetimepicker label="DATE" displayFormat="dd-mmm-yyyy"></ajax:datetimepicker>
<ajax:textarea labelposition="center"></ajax:textarea>
</ajax:div>
</ajax:tabbedpanel>