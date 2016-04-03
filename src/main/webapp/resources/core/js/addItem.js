$(document).ready(function() {
	$("#addItem").click(function() {
		if ($("#newItem").val() != "") {
			$("#items").append(
				$("<p>").text($("#newItem").val()));
		}
	});
	$("#addTitle").click(function() {
		$(".container h2").text($("#title").val());
	});
});