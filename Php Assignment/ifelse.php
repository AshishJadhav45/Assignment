
<?php
// <!-- Write a program to check student grade based on the marks using if else statement. -->

// <!-- conditions
// if marks 60 or more print first division

// 2 if marks between 45 to 59 will be second division

// 3 if marks between 33 to 44 grade will be third division

// 4 if marks less than 33 student will be fail-->


$marks = readline("Enter your percentage :");

if ($marks > 59){
    echo "Congrats you got a first division";
    
}
elseif($marks>44){
    echo "your division is second";
}
elseif($marks>33){
    echo "your division is  third:";
}
else{
    echo "Sorry you failed in exam";
}








?>