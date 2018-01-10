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

        /*
        Char myString = "A";
        System.out.println(myString + " is for apples");
        */

        // Discovered that we cannot assign char data type to a String variable


//    Change your code to assign the value 3.14159 to myString.
//    What happens?

        /*
        float myString = 3.14159;
        System.out.println(myString);
        */

        // Discovered that we cannot assign float data type to a String defined variable


//    Declare an long variable named myNumber,
//    but do not assign anything to it.
//    Next try to print out myNumber to the console.
//    What happens?

        /*
        long myNumber;
        System.out.println(myNumber);
        */

        // Discovered we need to initialize (assign a value for the first time)


//    Change your code to assign the value 3.14 to myNumber.
//    What do you notice?

        /*
        long myNumber = 3.14;
        System.out.println(myNumber);
        */

        // Discovered 3.14 and long are incompatible data types


//    Change your code to assign the value 123L
//    (Note the 'L' at the end) to myNumber.


        /*
        long myNumber = 123L;

        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);
        */

//    Why does assigning the value 3.14 to a variable declared as a long not compile,
//    but assigning an integer value does?

        // int	4	Integers from -2,147,483,648 to 2,147,483,647
        // long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // 3.14 contains a decimal which is incompatible with long or int
        // long data type includes a larger scope of integers


//    Change your code to declare myNumber as a float.
//    Assign the value 3.14 to it.
//    What happens?
//    What are two ways we could fix this?

        /*
        float myNumber = 3.14;
        3.14 is a double data type
        */

//         Two ways to fix this problem are:
//             1 //
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

            // 2 //
//        float myNumber = (int) 3.14;
//        System.out.println(myNumber);



//    Copy and paste the following code blocks one at a time and execute them

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // x++ is post-incrementing x


        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        // ++y is pre-incrementing


//    Try to create a variable named class.
//    What happens?

        /*
        String class = "example";
        */

        // Discovered it cannot compile, "class" is a reserved keyword in Java


//    Rewrite the following expressions using the relevant shorthand assignment operators:

        int a = 4;
        // a = a + 5;
        // newValueForVariable = oldValueForVariable + 5;
        a += 5;
        System.out.println(a);

        int b = 3;
        int c = 4;
        // c = c * b;
        // newValueForOldVarName = OldValueForOldVarName * b;
        c *= b;
        System.out.println(c);

        int d = 10;
        int f = 2;
        // d = d / f;
        // f = f - d;
        d /= f;
        f -= d;
        System.out.println(d);
        System.out.println(f);

    }
}
