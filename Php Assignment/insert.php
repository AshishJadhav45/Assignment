<?php

$host = "localhost";
$username = "root";
$password = " ";
$dbname = "sumit";

$conn = new mysqli($host,$username,$password,$dbname);

if ($conn -> connect.error){
    die("connectin failed".$conn->connect_error);
    
}



?>