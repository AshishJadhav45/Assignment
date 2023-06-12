<?php

//   Write a php script to demonstrate numeric array , Associative array , Multidimentional array 

// Numeric Array 

$numbers = [2,4,6,7,9];

echo "numeric array"."\n";
foreach ($numbers as $value){
    echo "$value" . "\n";
}
echo "\n";

// Associative array

$associative = ["name" => "sumit", "age" => 24, "country" => "india"];

echo "Associative array". "\n";

foreach ($associative as $key => $value){
    echo $key . ":" . $value . "\n";
}
echo "\n";

// Multidimensional array 

$multi = [
    ["apple", "banana", "cherry"],
    ["car", "bike", "bus"],
    ["red", "blue", "green"]
];

echo "multidimensional array:\n";

foreach ($multi as $row){
    foreach ($row as $item){
        echo $item . " ";
    }
    echo "\n";
}










?>