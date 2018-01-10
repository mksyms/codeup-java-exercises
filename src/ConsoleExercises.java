import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//  Prompt a user to enter a integer
//  and store that value in an int variable using the nextInt method.
    // What happens if you input something that is not an integer? //

        /*
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();
        System.out.println("You entered: " + userInput);
        */


//  Prompt a user to enter 3 words and store each of them in a separate variable,
//  then display them back, each on a newline.

        /*
        System.out.println("Please enter 3 separate words.\nPress the return key after each entry: ");

        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();

        System.out.println(firstWord + secondWord + thirdWord);
        */

    // What happens if you enter less than 3 words? //
        /*  Entering more than one word will only register the total number of words equivalent to the number of sc.next() */
    // What happens if you enter more than 3 words? //
        /*  Entering less will cause the console to wait for the next input */


//  Prompt a user to enter a sentence,
//  then store that sentence in a String variable using the .next method,
//  then display that sentence back to the user.

        /*
        System.out.println("Please enter a full sentence:\n");
        String sentenceInput = sc.next();
        System.out.println(sentenceInput);
        */

    // Do you capture all of the words? //
        /*  No. Discovered that it only prints out the word before the first " " */


//  Rewrite the above example using the .nextLine method.

        /*
        System.out.println("Please enter a full sentence:\n");
        String sentenceInput = sc.nextLine();
        System.out.println(sentenceInput);
        */


//-------------------------------------------------------------------------------------------------------------------------//


//  Calculate the perimeter and area of Codeup's classrooms
//  Prompt the user to enter values of length and width of the classroom.
//  Use the .nextLine method to get user input and cast the resulting string to a numeric type.
        // Assume that the rooms are perfect rectangles.
        // Assume that the user will enter valid numeric data for length and width.

//  Bonus
        // Accept decimal entries
        // Calculate the volume of the rooms

        //        area = length x width
        //        perimeter = 2 x length + 2 x width
        //        volume = length * height * width

        System.out.println("Please enter the Length, Height, and then the Width for one of Codeup's Classrooms.");
        float l = (float) sc.nextInt();
        float w = (float) sc.nextInt();
        float h = (float) sc.nextInt();
        float area = l *= w;
        float perimeter = 2 * (l+ w);
        float volume = l * h * w;
        System.out.println("The area of this classroom is " + area);
        System.out.println("The perimeter of this classroom is " + perimeter);
        System.out.println("The volume of this classroom is " + volume);

    }
}
