package src;

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

//MAIN METHOD ENTRY POINT ALL METHODS HAVE TO BE CALLED HERE TO RUN/TEST!!!
    //
    ///

    public static void main(String[] args) {

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
}
