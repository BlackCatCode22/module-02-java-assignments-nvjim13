// NVJ 8/27/24
// StringPractice.java


public class StringPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my String Practice Program!\n");

        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Hello From My STRING Practice Program!";

        System.out.println("\n myPracticeStr is: " + myPracticeStr);

        // Use a few String methods
        // a method is a object-oriented language name for a function.
        // methods always have a pair of () attached to them
        //
        //use the toUpperCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // Prove it...
        System.out.println("myNewStr is: " + myNewStr);

        // toLowerCase()
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);

        // use the length method
        // Create an int variable, because the length method returns an int.
        int myInt = 0;

        // find the length of our string object.
        myInt = myPracticeStr.length();

        // Prove it...
        System.out.println("\nThe length of " + myPracticeStr + " is " + myInt);

        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");
        System.out.println(" The value of isItThere is: " + isItThere);

        // charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);
        // Output the results
        System.out.println("\nThe char at index " + anotherInt + " is " + myChar);

        // .indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\nThe index of STR is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;
        oneMoreInt = myPracticeStr.lastIndexOf("m");
        System.out.println("\noneMoreInt is: " + oneMoreInt);

        // SubString!!
        String myLastStrObject;
        myLastStrObject = myPracticeStr.substring(0,myPracticeStr.indexOf("STR"));

        // Output that
        System.out.println("\nmyLastStrObject is: " + myLastStrObject);




    }
}