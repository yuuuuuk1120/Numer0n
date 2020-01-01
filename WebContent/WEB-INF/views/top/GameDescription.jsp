<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ヌメロン</title>
</head>
<body>
    <h2>ヌメロンのルール概要</h2>
    <form action="topIndex" method="POST">
        <ul>
            <li>それぞれのプレイヤーが、0-9までの数字で、3桁の番号を作成します。<br>
                数字に重複は無いので「550」「377」といった同じ数字を2つ以上使用した番号は作れません。
            </li>
            <li>先攻のプレイヤーは相手の番号を推理してコールします。<br>
                相手はコールされた番号と自分の番号を見比べ、コールされた番号がどの程度合っているかを発表します。<br>
            </li>
            <li>数字と桁が合っていた場合:「EAT」（イート）<br>
                数字は合っているが桁は合っていない場合：「BITE」（バイト）
            </li>
            <li>ex)こちらの番号が「765」で、コールされた番号が「746」であった場合<br>
                「1EAT-1BITE」となります。
            </li>
            <li>これを先攻・後攻が繰り返して行い、先に相手の番号を完全に当てきった<br>
                （3桁なら3EATを相手に発表させた）プレイヤーの勝利となります。
            </li>
        </ul>


        <input type="submit" value="ゲーム開始！">
    </form>


</body>
</html>