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
            <h2>プレイヤー2の数字を登録します。</h2>
            <jsp:include page="form2.jsp" flush="true" />
        </c:when>
        <c:otherwise>
            <h2>プレイヤー2の数字を登録します。</h2>
            <jsp:include page="form2.jsp" flush="true" />
            <!--
     <input type="number" name="player2" max="9" min="0" step="1">
    <label for="hundreds2-1"></label>

    <input type="number" name="player2" max="9" min="0" step="1">
    <label for="tens2-1"></label>

    <input type="number" name="player2" max="9" min="0" step="1">
    <label for="first2-1"></label>
     -->

        </c:otherwise>
    </c:choose>
</body>
</html>