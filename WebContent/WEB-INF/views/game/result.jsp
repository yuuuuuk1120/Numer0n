<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>

<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ヌメロン結果</title>
</head>

<body>
    <h2>結果</h2>
    <p>${pname1}⇒${pname2}</p>
    <p>${n1 }</p>
    <p>${h2 }イート${b2 }バイト</p>
    <br />
    <br />

    <p>${pname2}⇒${pname1}</p>
    <p>${n2 }</p>
    <p>${h1 }イート${b1 }バイト</p>
    <br />
    <br />
</body>
</html>