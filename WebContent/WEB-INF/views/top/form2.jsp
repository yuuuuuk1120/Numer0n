<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html>
<html lang="ja">
<body>
    <form action="numeron1" method="POST">

        <label for="name">プレイヤー2名</label> <br /> <input type="text"
            name="name" size="50">

        <p>0～9までの三桁の数字を入力してください。</p>
        <p>※三桁のそれぞれの数字が重複しないように注意してください。</p>

        <input type="number" name="player2" step="1"> <label
            for="player2"></label> <input type="submit" value="登録" />
    </form>
</body>
</html>
