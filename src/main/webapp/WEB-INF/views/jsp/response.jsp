<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>I Don't Give Uh ${code}</title>
     
     <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    
    <spring:url value="/resources/core/js/hello.js" var="coreJs" />
    <script src="${coreJs}"></script>
    
    <spring:url value="/resources/core/css/hello.css" var="coreCss" />
    <link href="${coreCss}" rel="stylesheet" />
</head>
<body>
    <div class="container-fluid header" style="text-align: center; background-color: rgba(0,0,0,0.7); height: 200px;">
        <h1>I Don't Give Uh ${code}</h1>
        <p>Life is full of important decisions. Let us make them for you!</p>
    </div>
    <div class="container answer">
        <p>Your Question: ${decision.question}?</p>
        <p>Answer: ${decision.answer ? "YES" : "NO"}</p>
    </div>
    <c:if test="${decision.sure}">
    <div class="container answer">
        <p>${comment}</p>
    </div>
    </c:if>
    <div class="container">
       <form:form class="form" method="post" action="/${code}/decide/yesno/resp" modelAttribute="decision">
          <a href="/${code}/decide/yesno"><button type="button" class="btn">Ask Another Yes/No Question</button></a>
          <a href="/${code}/"><button type="button" class="btn">Go Back to Home</button></a>
          <form:input type="hidden" path="question" value="${decision.question}"/>
          <form:input type="hidden" path="answer" value="${decision.answer}"/>
          <form:input type="hidden" path="sure" value="true"/>
          <button class="btn" type="submit">Are You Sure?</button>
        </form:form>
    </div>
</body>
</html>