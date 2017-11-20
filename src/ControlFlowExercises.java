import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        System.out.println("Start with a Basic Do While Loop");

//--------WHILE LOOP----------------------------------------//
//                                                          //
//        int i = 5;                                        //
//                                                          //
//        while (i <= 15) {                                 //
//            System.out.print(i);                          //
//            System.out.print(" ");                        //
//            i += 1;                                       //
//        }                                                 //
//----------------------------------------------------------//


//--------DO-WHILE LOOP-------------------------------------//
//      int i = 100;                                        //
//                                                          //
//      do {                                                //
//          System.out.println(i);                          //
//          i -= 5;                                         //
//      } while (i >= -10);                                 //
//----------------------------------------------------------//
// double i = 2;                                            //
//                                                          //
//        do {                                              //
//            int castDblToInt = (int) i;                   //
//            System.out.println(castDblToInt);             //
//            i = Math.pow(i, 2);                           //
//        } while (i < 1000000);                            //
//----------------------------------------------------------//


//--------FOR LOOP------------------------------------------//
//        for(int i = 5; i <= 15; i += 1) {                 //
//            System.out.print(i + " ");                    //
//        }                                                 //
//----------------------------------------------------------//
//        for(int i = 0; i <= 100; i += 2) {                //
//            System.out.println(i);                        //
//        }                                                 //
//----------------------------------------------------------//
//        for(int i = 100; i >= -10; i -= 5) {              //
//            System.out.println(i);                        //
//        }                                                 //
//----------------------------------------------------------//
//        for(double i = 2; i < 1000000; i = Math.pow(i, 2)) {
//            int castDblToInt = (int) i;                   //
//            System.out.println(castDblToInt);             //
//        }                                                 //
//--------------another way of solving ^ this problem-------//
//        for(long i =2; i < 1000000; i *= i) {             //
//            System.out.println(i);                        //
//        }                                                 //


//-------------------TACOBODY BAGLADY-------------------------------------------------------//
//        Write a program that prints the numbers from 1 to 100.                            //
//        Print (x3) or multiples of three print “Tacobody” instead of the number           //
//        For (x5) the multiples of five print “Baglady”                                    //
//        For numbers which are multiples of both three and five print “TacobodyBaglady”.   //

//        String fizz = "tacobody";
//        String buzz = "baglady";
//
//        for (int i = 1; i <= 100; i += 1) {
//            if  (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(fizz + buzz);
//            } else if (i % 3 == 0) {
//                System.out.println(fizz);
//            } else if (i % 5 == 0){
//                System.out.println(buzz);
//            } else
//            System.out.println(i);
//        }

//---------------------------Display a table of powers.-------------------------//
//                                                                              //
//        Prompt the user to enter an integer.                                  //
//        Display a table of squares and cubes from 1 to the value entered.     //
//        Ask if the user wants to continue.                                    //
//        Assume that the user will enter valid data.                           //
//        Only continue if the user agrees to.                                  //
//                                                                              //
//        Example Output                                                        //
//        What number would you like to go up to? 5                             //
//                                                                              //
//        Here is your table!                                                   //
//                                                                              //
//                number | squared | cubed                                      //
//                ------ | ------- | -----                                      //
//                1      | 1       | 1                                          //
//                2      | 4       | 8                                          //
//                3      | 9       | 27                                         //
//                4      | 16      | 64                                         //
//                5      | 25      | 125                                        //
//                                                                              //
//------------------------------------------------------------------------------//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to?    ");
//        int userInput = scan.nextInt();
//
//        System.out.println("\n Here is your Table!");
//        System.out.println("\n number | squared | cubed");
//        System.out.println("------ | ------- | ------");
//
//        for(int i = 1; i <= userInput; i += 1) {
//            String output = "";
//            output += String.format("%-7d", i);
//            output += String.format("|%-9d", i * i);
//            output += String.format("|%d", i * i * i);
//            System.out.println(output);
//        }


        //once you have made your table, put it in a do-while loop
        // boolean variable has to be outside of the loop because it's block scoped

        Scanner scan = new Scanner(System.in);
        boolean willContinue = true;

        do {
            System.out.print("What number would you like to go up to?    ");
            int userInput = scan.nextInt();

            System.out.println("\n Here is your Table!");
            System.out.println("\n number | squared | cubed");
            System.out.println("------ | ------ | ------");

            for (int i = 1; i <= userInput; i += 1) {
                String output = "";
                output += String.format("%-7d", i);
                output += String.format("|%-9d", (int) Math.pow(i, 2));
                output += String.format("|%d", (int) Math.pow(i, 3));
                System.out.println(output);
            }

            System.out.println();

        } while (willContinue);

//----------------------- Convert given number grades into letter grades.-----------//
//        Prompt the user for a numerical grade from 0 to 100.                      //
//        Display the corresponding letter grade.                                   //
//        Prompt the user to continue.                                              //
//        Assume that the user will enter valid integers for the grades.            //
//        The application should only continue if the user agrees to.               //
//                                                                                  //
//        Grade Ranges:                                                             //
//        A : 100 - 88                                                              //
//        B : 87 - 80                                                               //
//        C : 79 - 67                                                               //
//        D : 66 - 60                                                               //
//        F : 59 - 0                                                                //

//        Scanner scan = new Scanner(System.in);
//        String userChoice;
//
//        do {
//
//
//            System.out.println("Please enter a numeric grade: ");
//            int gradeEntered = scan.nextInt();
//            char letterGrade = ' ';
//
//            if (gradeEntered >= 88) {
//                letterGrade = 'A';
//            } else if (gradeEntered >= 80) {
//                letterGrade = 'B';
//            } else if (gradeEntered >= 67) {
//                letterGrade = 'C';
//            } else if (gradeEntered >= 60) {
//                letterGrade = 'D';
//            } else if (gradeEntered >= 0) {
//                letterGrade = 'F';
//            }
//
//            System.out.println(letterGrade);
//
//            System.out.println("\nDo you wish to continue? [y/n]");
//            userChoice = scan.next();
//
//        } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));
//
//
//









    }
}












