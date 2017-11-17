import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInput;
        Scanner scanInput = new Scanner(System.in);

        System.out.print("Enter an integer");
        userInput = scanInput.nextInt();

        System.out.println("You entered: " + userInput);

    }
}
