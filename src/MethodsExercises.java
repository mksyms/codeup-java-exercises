//                                                                                  //
// ====================================== BASIC ARITHMETIC - EXERCISE 1             //
//                                                                                  //
//    Create four separate methods. Each will perform an arithmetic operation:      //
//                                                                                  //
//    (+) Addition                                                                  //
//    (-) Subtraction                                                               //
//    (*) Multiplication                                                            //
//    (/) Division                                                                  //
//                                                                                  //
//    Each function needs to take two parameters/arguments                          //
//    so that the operation can be performed.                                       //
//                                                                                  //
//    Test your functions and verify the output.                                    //
//                                                                                  //
//    Add a modulus function that finds the modulus of two numbers.                 //
//                                                                                  //
//    What happens if we try to divide by zero? What should happen?                 //
//                                                                                  //

import java.util.Scanner;

class MethodsExercises {
    public static void main(String[] args) {
        // 1 //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number of the operation");
        double firstNum = sc.nextDouble();
        System.out.println("Please input the second number of the operation");
        double secondNum = sc.nextDouble();

        System.out.println(add(firstNum,secondNum));
        System.out.println(subtract(firstNum,secondNum));
        System.out.println(multiply(firstNum,secondNum));
        System.out.println(divide(firstNum,secondNum));
        System.out.println(modulus(firstNum,secondNum));

        // 2 //
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("The number you chose is: " + userInput);

        // 3 //
        userInteractionFactorial(sc);

        // 4 //

        diceApplication(sc);

    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

//    private static double multiply(double num1, double num2) {
//        return num1 * num2;
//    }

    private static double divide(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Does not compute!");
            return 0;
        }
    }
    private static double modulus(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Does not compute!");
            return 0;
        }
    }


// ====================================== EXERCISE 1 - BONUS
//  Create your multiplication method without the * operator.
//    (Hint: a loop might be helpful)
//  Do the above with recursion.

    private static double multiply(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            if (num2 > 0) {
                return multiply(num1, num2 - 1) + num1;
            } else {
                return multiply(num1, num2 + 1) - num1;
            }
        }
        return 0;
    }


// ====================================== EXERCISE 2

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Entry is not a number");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Entry number is not within range");
            return getInteger(min, max);
        }
    }


// ====================================== EXERCISE 3
//  Calculate the factorial of a number:
//    Use the long type to store the factorial.
//    Prompt the user to enter an integer from 1 to 10.
//    A factorial is a number multiplied by each of the numbers before it.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Continue only if the user agrees to.

    public static long calculateTheFactorial(int num) {
        System.out.println("Please enter an integer between 1 and 10");
        long integerInput = 1;
        for (int i = 1; i <= num; i += 1) {
            integerInput *= 1;
        }
        return integerInput;
    }


// ====================================== EXERCISE 3 - BONUS

    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
            System.out.println("Please enter an integer from 1 to 12");
            int userInt = getInteger(1, 12);
            System.out.println(calculateTheFactorial(userInt));
            do {
                System.out.println("Would you like to continue? [ y / n ]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
            willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }



// ====================================== EXERCISE 4

    public static int rolledDiceNumber(int min, int max) {
        int diceRange = (max - min) + 1;
        return (int)(Math.random() * diceRange) + min;
    }

   public static void diceApplication(Scanner sc) {
       String userRoll;
       System.out.println("Please enter the number of sides for your dice: ");
       int numberOfSides = getInteger(1, 16);
       do {
           System.out.println("You have rolled a " + rolledDiceNumber(1, numberOfSides) + " and a " + rolledDiceNumber(1, numberOfSides));
           do {
               System.out.println("Would you like to roll again? [ y / n ]");
               userRoll = sc.next().trim();
           } while (!userRoll.equalsIgnoreCase("y") & !userRoll.equalsIgnoreCase("n"));

       } while (!userRoll.equals("n"));
   }
}

















