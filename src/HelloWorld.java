public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//    Create an int variable named myFavoriteNumber
//    and assign your favorite number to it,
//    then print it out to the console.

        int myFavoriteNumber = 21;
        System.out.println("My favorite number is " + myFavoriteNumber);


//    Create a String variable named myString
//    and assign a string value to it,
//    then print the variable out to the console.

        String myString = "If I Know You by The Presets";
        System.out.println("Best Dancing & Coding Song is " + myString);


//    Change your code to assign a character value to myString.
//    What do you notice?

        // we can't assign chars to a string variable
//        -----------------------------------------------------------------------------------------------
//        myString = "P";
//        System.out.println("The Presets band starts with the letter " + myString);
//        ---------------------------------------------------------------------------------------
//        Errors in Terminal
//        HelloWorld.java:23: error: variable myString is already defined in method main(String[])
//        char myString = "P";
//             ^
//        HelloWorld.java:23: error: incompatible types: String cannot be converted to char
//        char myString = "P";
//                        ^
//        2 errors
//-----------------------------------------------------------------------------------------------


//    Change your code to assign the value 3.14159 to myString.
//    What happens?

//        ----------------------------------------------------------------------------------------
//        float myString = 3.14159;
//        System.out.println(myString);
//        ---------------------------------------------------------------------------------------
//        Errors in Terminal
//        error: Class names, 'HelloWorld', are only accepted if annotation processing is explicitly requested
//         1 error
//-----------------------------------------------------------------------------------------------


//     Declare an long variable named myNumber,
//     but do not assign anything to it.
//     Next try to print out myNumber to the console. What happens?

        // we need to initialize (assign a value for the first
//        ---------------------------------------------------------------------------------------
//        long myNumber;
//
//        >> nothing but prior compiled code is returned in terminal
//-----------------------------------------------------------------------------------------------


//    Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14;


    }
}
