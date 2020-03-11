<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function reflect(that) {

		var countryName = $(that, "#countryVal").val();
		var requestedData = "countryVal=" + countryName;

		$.getJSON("stateviacountry", requestedData, function(data) {
			var sparrow = "";

			$.each(data.dtoList, function() {

				sparrow += "<option>" + this.state + "</option>";

			});
			sparrow += "";

			$("#stateval").html(sparrow);
		});
	}
</script>

</head>
<body style="margin-left: 20px;">
	<h1>Struts2 and jQuery JSON integration Example</h1>
	<form action="countrystate" method="post">
		<input type="submit" value="Click Me" />
	</form>
	<div style="margin-top: 10px;">
		Country:
		<select onchange="reflect(this);">
			<option>Select County</option>
			<s:iterator value="dtoList">
				<option id="countryVal"><s:property value="country" /></option>
			</s:iterator>
		</select>
		State:
		<select id="stateval">
			<option>Select State</option>
		</select>
	</div>
</body>
</html>