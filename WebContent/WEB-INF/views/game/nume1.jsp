<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>プレイヤー1入力画面</title>
</head>

<body>
    <h2>${pname2 }さんの三桁の数字を予想して数字を入力してください。</h2>
    <form action="numeron2" method="POST">
        <input type="number" name="playerAnticipation1" step="1"> <label
            for="playerAnticipation1"></label>

        <!--
    <input type="number" name="playerAnticipation1" max="9" min="0" step="1">
    <label for="hundreds1-2"></label>

    <input type="number" name="playerAnticipation1" max="9" min="0" step="1">
    <label for="tens1-2"></label>

    <input type="number" name="playerAnticipation1" max="9" min="0" step="1">
    <label for="first1-2"></label>
    -->

        <input type="submit" value="予想！！">
    </form>
</body>
</html>