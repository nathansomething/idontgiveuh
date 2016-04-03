$(document).ready(function() {
	
	var myChoices = [];
	var title = "";
	
	$("#daTitle").hide();
	$("#addItem").click(function() {
		if ($("#newItem").val() != "") {
			var newItem = $("#newItem").val();
			$("#items").append(
				$("<p>").addClass("text-center").text(newItem));
			myChoices.push(newItem);
		}
	});
	
	$("#setTitle").click(function() {
		$("#daTitle").show();
		title = $("#title").val();
		$("#daTitle").text(title);
	});
	
	$(".idontgiveuh").click(function() {
		$.ajax({
		    type : "POST",
		    url : "acomplicatedthing/resp",
		    data : {
		        choices: myChoices,
		    },
		    success : function(response) {
		       alert("I worked for some reason");
		    },
		    error : function(e) {
		       alert('Error: ' + e);
		    }
		});
	});
});