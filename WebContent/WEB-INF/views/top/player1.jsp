<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ヌメロン</title>
</head>

<body>
    <c:choose>
        <c:when test="${error!=null}">
            <h1>
                <c:out value="${error }" />
            </h1>
            <jsp:include page="form1.jsp" flush="true" />
        </c:when>



        <c:otherwise>
            <jsp:include page="form1.jsp" flush="true" />
            <!--
    <input type="number" name="player1" max="9" min="0" step="1">
    <label for="hundreds1-1"></label>

    <input type="number" name="player1" max="9" min="0" step="1">
    <label for="tens1-1"></label>

    <input type="number" name="player1" max="9" min="0" step="1">
    <label for="first1-1"></label>
     -->

        </c:otherwise>
    </c:choose>
</body>
</html>