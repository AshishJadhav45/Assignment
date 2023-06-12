<!DOCTYPE html>
<html>
<head>
    <title>Flight Rescheduling Form</title>
</head>
<body>
    <h2>Flight Rescheduling Form</h2>

    <?php
    // Check if the form is submitted
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Retrieve the submitted data
        $flightNumber = $_POST["flightNumber"];
        $currentDate = $_POST["currentDate"];
        $newDate = $_POST["newDate"];

        // Perform any necessary validations
        $errors = [];
        if (empty($flightNumber)) {
            $errors[] = "Flight number is required.";
        }
        if (empty($currentDate)) {
            $errors[] = "Current date is required.";
        }
        if (empty($newDate)) {
            $errors[] = "New date is required.";
        }

        // If there are no errors, display the updated information
        if (empty($errors)) {
            echo "<h3>Flight Rescheduling Details:</h3>";
            echo "<p><strong>Flight Number:</strong> " . $flightNumber . "</p>";
            echo "<p><strong>Current Date:</strong> " . $currentDate . "</p>";
            echo "<p><strong>New Date:</strong> " . $newDate . "</p>";
        } else {
            // If there are errors, display them to the user
            echo "<h3>Error:</h3>";
            foreach ($errors as $error) {
                echo "<p>" . $error . "</p>";
            }
        }
    }
    ?>

    <form method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
        <label for="flightNumber">Flight Number:</label>
        <input type="text" id="flightNumber" name="flightNumber" required><br><br>

        <label for="currentDate">Current Date:</label>
        <input type="date" id="currentDate" name="currentDate" required><br><br>

        <label for="newDate">New Date:</label>
        <input type="date" id="newDate" name="newDate" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
