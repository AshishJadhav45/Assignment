<?php

?>
<!DOCTYPE html>
<html>
<head>
    <title>send email</title>
</head>
<body>
<form action="send.php" method="post">
    <label>Enter Email Address</label>
    <input type="email" name="mail"><br><br>
    <label>Subject</label>
    <input type="text" name="subj"><br><br>
    <label style="margin-left: 10px">Enter a message</label>
    <input type="text" name="msg"><br><br>
    <input type="submit" name="sbt" style="margin-left: 150px">
</form>
</body>

</html>
