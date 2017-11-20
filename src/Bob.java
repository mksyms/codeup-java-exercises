import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//  Create a class Bob for the following exercise with a main method.
//  Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//      If you ask him a question.
//        Bob answers 'Sure.'
//      If you yell at him.
//        He answers 'Whoa, chill out!'
//      If you address him without actually saying anything.
//        He says 'Fine. Be that way!'
//      Else
//        He answers 'Whatever.'

        // if userInput contains (?)
        // sout 'Sure.'

        // if userInput contains (!) or multiple char Uppercase (RAWR)
        // sout 'Whoa, chill out!'

        // if userInput is " " space or "/n"
        // sout 'Fine. Be that way!'

        // else
        // sout 'Whatever.'

        System.out.println("Feel free to say something to angsty Bob or ask him a question.");

        String userInput;
        Scanner scan = new Scanner(System.in);

        userInput = scan.nextLine();
        System.out.print(userInput);

        if (userInput.endsWith("?")) {
            System.out.println("\'" + "Sure." + "\'");
//        } else if (userInput.contains("!") || userInput.Character.isUpperCase(charAt)){
//            System.out.println("\'" + "Whoa, chill out!" + "\'");
//        } else if (userInput.)
            System.out.println("");
        }
    }
}
