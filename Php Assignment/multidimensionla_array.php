<html>

<head>
    <?php


        $marks = array("mangesh" => array(
            "physics" => 45,
            "math" => 35,
            "chemistry" => 47,
        ), 
        "sumit" => array(
            "physics" => 44, 
            "Math" => 30,
            "chemistry" => 27,
        ),
        "shubham" => array(
            "physics" => 40, 
            "Math" => 33,
            "chemistry" => 25,
        )
        );


        echo "Marks for mangesh in physics:";
        echo $marks['mangesh']['physics'];

        echo "Marks for sumit in Math:";
        echo $marks['sumit']['Math'];

        echo "Marks for shubham in chemistry:";
        echo $marks['shubham']['chemistry'];



      

            



    ?>
</head>
</html>