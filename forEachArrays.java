// 9/3/24
// froEachArrays.java

public class forEachArrays {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my for each practice! \n");

        // Create an array of cars. Do this two different ways and to be able to explain to lab partner.
        // Create a cars[] array using initialization
        String[] cars = {"BMW", "Tesla", "Honda"};

        // Lets output the for arrays using a for each loop.
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\nMy for loop is done.");

        // Use a for : each loop to do the same thing.
        for (String car : cars) {
            System.out.println(car);
        }

        // Create a string array using the new operator.
        // Create a for element string array named myCars
        String[] myCars = new String[4];

        // myCars[0], myCars[1], myCars[3]

        // Fill the newly created string[] array with data.
        myCars[0] = "Tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to putput the mycars[] array
        for (String myCar : myCars) {
            System.out.println("\nA car in myCars array is: " + myCar);
        }

        String[] myStrings = new String[6];


        /*
        // Use a for loop to fill the array with some string.
        for (int i = 0; i < 60; i++) {
            // Fill my array with strings
            myStrings[i] = "This is string number: " + (i + 1);
        }

         */

        int aNum = 0;
        for (String aStr : myStrings) {
            // Fill my array with strings
            myStrings[aNum] = "This is string number: " + (aNum + 1);
            aNum++;
        }


        // Now... use a for : each loop to output the myString array
        for (String aStr : myStrings) {
            System.out.println("\nAn element in myString[] is: " + aStr);
        }



        
        // Lets reverse a string.
        String myStrToReverse = "abcdefg";

        //Output the chars of myStrToReverse
        for (int i = 0; i < 7; i++) {
            System.out.println("myStrToReverse [" + i + "] is: " + myStrToReverse.charAt(i));
        }
        System.out.println("End if initial output.");

        // Create the reverse string.
        String reversedStr = "";
        // Output reversedStr.
        System.out.println("reversedStr before reversion loop is: " + reversedStr);

        for (int i = 6; i >= 0; i--) {
            char charToAdd = myStrToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));
        }
        // Output reversedStr.
        System.out.println("reversedStr after reversion loop is: " + reversedStr);








    }
}