<%@taglib uri="/struts-dojo-tags" prefix="ajax"%>
<!-- This head tag should be used in order to load java script files in our application -->
<ajax:head />
<!-- This ajax dojo's are used for loading the page without need to reload the url once we click on different tabs in the menu -->
<ajax:tabbedpanel id="main">
	<ajax:div label="REG">
		<ajax:tree label="TG">

			<ajax:treenode label="NZB">
				<ajax:treenode label="BDN"></ajax:treenode>
				<ajax:treenode label="KMR"></ajax:treenode>
			</ajax:treenode>

			<ajax:treenode label="HYD">
				<ajax:treenode label="KKP"></ajax:treenode>
				<ajax:treenode label="DSNR"></ajax:treenode>
			</ajax:treenode>

		</ajax:tree>

	</ajax:div>
</ajax:tabbedpanel>