<?php
// Check if the form is submitted
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  // Retrieve the username and password from the form
  $username = $_POST['username'];
  $password = $_POST['password'];

  // Perform the login validation (replace this with your own logic)
  if ($username === 'your_username' && $password === 'your_password') {
    // Redirect to the success page
    header('Location: success.php');
    exit;
  } else {
    // Login failed, redirect back to the login form with an error message
    header('Location: login.html');
    exit;
  }
}
?>
