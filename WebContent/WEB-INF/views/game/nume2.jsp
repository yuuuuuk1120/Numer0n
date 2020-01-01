<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>プレイヤー2入力画面</title>
</head>

<body>
    <h2>${pname1}さんの三桁の数字を予想して数字を入力してください。</h2>
    <form action="result" method="POST">

        <input type="number" name="playerAnticipation2" step="1"> <label
            for="playerAnticipation2"></label>

        <!--
    <input type="number" name="playerAnticipation2" step="1">
    <label for="playerAnticipation2"></label>

    <input type="number" name="playerAnticipation2" max="9" min="0" step="1">
    <label for="hundreds2-2"></label>

    <input type="number" name="playerAnticipation2" max="9" min="0" step="1">
    <label for="tens2-2"></label>

    <input type="number" name="playerAnticipation2" max="9" min="0" step="1">
    <label for="first2-2"></label>
     -->

        <input type="submit" value="予想！！">
    </form>
</body>
</html>