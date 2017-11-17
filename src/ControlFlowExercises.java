

public class ControlFlowExercises {
    public static void main(String[] args) {

        System.out.println("Start with a Basic Do While Loop");
//        Scanner scan = new Scanner(System.in);

//--------BASIC LOOP-----------------------------------------//
//                                                           //
//        int i = 5;                                         //
//                                                           //
//        while (i <= 15) {                                  //
//            System.out.print(i + " ");                     //
//            ++i;                                           //
//        }                                                  //



//--------DO-WHILE LOOP--------------------------------------//
//      int i = 100;                                         //
//                                                           //
//      do {                                                 //
//          System.out.println(i);                           //
//          i -= 5;                                          //
//      } while (i >= -10);                                  //

        double i = 2;

        do {
            int castDblToInt = (int) i;
            System.out.println(castDblToInt);
            i = Math.pow(i, 2);
        } while (i < 1000000);



//        for(int i = 5; i <= 15; i += 1) {
//            System.out.println();
//        }
    }
}
