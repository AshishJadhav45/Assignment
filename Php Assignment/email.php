<?php

use PHPMailer\PHPMailer\PHPMailer;
require 'PHPMailer/src/PHPMailer.php';
require 'PHPMailer/src/SMTP.php';
require 'PHPMailer/src/Exception.php';

// Create a new PHPMailer instance
$mail = new PHPMailer;

// SMTP configuration
$mail->isSMTP();
$mail->Host = 'smtp.gmail.com'; 
$mail->SMTPAuth = true;
$mail->Username = 'ashish.jadhav.dypimr.com'; 
$mail->Password = 'Psycho#45'; 
$mail->SMTPSecure = 'tls';
$mail->Port = 587;

// Sender and recipient
$to=$_POST['mail'];
$sub=$_POST['subj'];
$message=$_POST['msg'];
$mail->setFrom('mangeshwayaleducational@gmail.com', 'Mangesh wayal');
$mail->addAddress($to, 'Hello');

// Email content
$mail->Subject =$sub;
$mail->Body = $message;

if ($mail->send()) {
    echo "Email sent successfully.";
} else {
    echo "Email sending failed. Error: " . $mail->ErrorInfo;
}
?>