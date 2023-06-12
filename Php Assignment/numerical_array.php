<HTMl>
    <body>
        <?php


        //  First methond to create an arrry

        $numbers = array(1,2,3,4,5);

        foreach($numbers as $value){

            echo "value is $value, <br/>";
        }

//         Second method to create array

        $numbers[0] = "one";
        $numbers[1] = "two";
        $numbers[2] = "Three";
        $numbers[3] = "Four";
        $numbers[4] = "Five";

        foreach ($numbers as $value){
            echo "Values is $value <br/>";
        }

        ?>
    </body>
</HTMl>