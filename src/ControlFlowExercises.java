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


        Scanner scan = new Scanner(System.in);

        System.out.print("What number would you like to go up to?    ");
        int userInput = scan.nextInt();

        for(int i = 1; i <= userInput; i += 1) {
            System.out.println("The number is " + i);
            System.out.println("The number squared is " + Math.pow(i, 2));
            System.out.println("The number cubed is " + Math.pow(i, 3));
        }

    }
}












