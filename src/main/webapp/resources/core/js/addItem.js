$(document).ready(function() {
	$("#addItem").click(function() {
		$(".container.choices").append(
				$("#items").addClass("row").append(
						$("<p>").addClass("col-md-4").text(
								$("#newItem").val())));
	});
	$("#addTitle").click(function() {
		$(".")
	});
});