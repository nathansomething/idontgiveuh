<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>I Don't Give Uh ${code}</title>
     
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
     
     <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    
    <spring:url value="/resources/core/js/hello.js" var="coreJs" />
    <script src="${coreJs}"></script>
    
    <spring:url value="/resources/core/js/addItem.js" var="addItem" />
    <script src="${addItem}"></script>
    
    <spring:url value="/resources/core/css/hello.css" var="coreCss" />
    <link href="${coreCss}" rel="stylesheet" />
</head>
<body>
    <div class="container-fluid header" style="text-align: center; background-color: rgba(0,0,0,0.7); height: 200px;">
        <h1>I Don't Give Uh ${code}</h1>
        <p>Life is full of important decisions. Let us make them for you!</p>
    </div>
    <div class="container"><h2 id="daTitle"><!-- CHOICE TITLE --></h2></div>
    <div class="container choices">
        <div class="row">
        <div class="col-md-6">
            <div class="input-group">
                <input id="title" type="text" class="form-control" placeholder="Title">
                <span class="input-group-addon"><button id="setTitle" class="comp-btn">Set Title</button></span>
            </div>
         </div>
         <div class="col-md-6">
            <div class="input-group">
				<input id="newItem" type="text" class="form-control" placeholder="New Item">
				<span class="input-group-addon"><button id="addItem" class="comp-btn">Add Item</button></span>
			</div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div id="items" style="margin-top: 60px;"></div>
        </div>
      </div>
      <div class="text-center">
        <button class="btn idontgiveuh" type="submit">I Don't Give a ${code}</button>
       </div>
   </div>
</body>
</html>