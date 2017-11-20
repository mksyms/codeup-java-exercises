public class StringExercise {

//      For each of the following output examples,
//      create a string variable named message that contains the desired output
//      and print it out to the console.
//      Do this with only one string variable and one print statement.

    public static void main(String[] args) {
        String message;

        message = "We don't need no education \nWe don't need no thought control";
        message += "\n\n";

        message += "Check \"this\" out!, \"s inside of \"s!";
        message += "\n\n";

        message += "In windows, the main drive is usually C:\\";
        message += "\n\n";

        message += "I can do backslashes " + "\\" + ", " + "double backslashes " + "\\" + "\\" + ", \nand the amazing triple backslash " + "\\" + "\\" + "\\" + "!";
        message += "\n\n";

        System.out.println(message);

    }
}
