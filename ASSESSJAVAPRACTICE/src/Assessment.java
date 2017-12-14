import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assessment {


//  ADD MAIN METHOD
//      to any of the classes outlined below to write code to check your work.
//  GITHUB CLONE
//      Add, commit, and push your solutions.

//  Create a class named Assessment inside of the src folder
//  Add the following static methods:
//
//  1 //
//        square: should accept and return a single integer number.
//        The method should return the number times itself.
    // number * number
//  2 //
//        sum: should accept 2 numbers,
//        either integers or doubles,
//        and returns the result of adding the two numbers together.
//              METHOD OVERLOADING
//
//        average: should accept an array of integers, and return the average of the passed numbers as a double.
    //    public static double average(int[] arrayOfIntegers) {
//}
       /* double Average
            = sum / array.length

            Enhanced For Loop
            int[] numbers = {1, 2, 3, 4, 5};
            for (int n : numbers) {
            System.out.println(n);
            } */


//    On your Assessment class create a static method named capitalizeRecords
// ArrayList<Integer> numbers = new ArrayList<>();
//      List Import & Inheritance
//    The method should both accept and return an ArrayList of User objects.
//    The returned list should have the same User objects in it, but each user's firstName and lastName properties should be properly capitalized. (i.e. the first letter of each property should be upper case)

//MAIN METHOD ENTRY POINT ALL METHODS HAVE TO BE CALLED HERE TO RUN/TEST!!!
    //
    ///

    public static void main(String[] args) {
        //1 number squared
        System.out.println();
        System.out.println("a number times itself is " + square(2));
        System.out.println("a number times itself is " + square(-4));
        System.out.println("a number times itself is " + square(0));
        //int only no dbl for lossy conversion errpr

        System.out.println();
        //2 INT
        System.out.println("if you add integers 5 + 6 together the sum is " + sum(5, 6));
        System.out.println("if you add integers -7 + -8 together the sum is " + sum(-7, -8));
        System.out.println("if you add integers 7 + -8 together the sum is " + sum(7, -8));

        System.out.println();
        //3 DOUBLES
        System.out.println();
        System.out.println("if you add the doubles 5.5 + 6.5 together the sum is " + sum(5.5, 6.5));
        System.out.println("if you add the doubles -7.2 + -7.2 together the sum is " + sum(-7.2, -7.2));
        System.out.println("if you add the doubles 0.1 + -0.5 together the sum is " + sum(0.1, -0.5));


        // integer array and AVERAGE
        System.out.println();
        int[] integers = {5, 10, 15};
        System.out.println(+average(integers) + " is the returned average for the passed numbers as a double.");


    }
    ///
    //
//

// 1

    public static int square(int number) {
        return number * number;
    }

    // 2 //
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    // 3 //
    // method overloading for doubles
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    // 4 //
    public static double average(int[] arrayOfIntegers) {
        double sumTotal = 0.0;
        for (int integer : arrayOfIntegers) {
            sumTotal += integer;
        }
        return sumTotal / arrayOfIntegers.length;
    }

    //    On your Assessment class create a static method named capitalizeRecords
// ArrayList<Integer> numbers = new ArrayList<>();
//      List Import & Inheritance
//    The method should both accept and return an ArrayList of User objects.
//    The returned list should have the same User objects in it, but each user's firstName and lastName properties should be properly capitalized. (i.e. the first letter of each property should be upper case)
    public static List<User> capitalizeRecords(List<User> users) {
        ArrayList<User> capitolRecords = new ArrayList<>(users);

        // 6 //
        for (User user : users) {

        }
        return capitolRecords;
    }
}
