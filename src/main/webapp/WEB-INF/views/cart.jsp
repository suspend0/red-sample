<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head><title>Items</title></head>
<body>
  <h3>Items:</h3>
  <c:forEach var="item" items="${items}">
	<div>${item.articleNo} @ ${item.price}, qty: ${item.quantity}  <a href="${pageContext.request.contextPath}/cart/removefromcart/${item.articleNo}">[-] remove</a> <a href="${pageContext.request.contextPath}/cart/addtocart/${item.articleNo}">[+] add</a></div>
  </c:forEach>
  <a href="${pageContext.request.contextPath}/cart/addtocart/${add}">add "${add}"</a>
</body>
</html>