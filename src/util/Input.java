package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

//    When an instance of this object is created,
//    the scanner property should be set to a new instance of the Scanner class.
//    The Class should have the following Methods:
//      (all of which return command line input from the user)

//          - String getString()

//          - boolean yesNo()

//          - int getInt(int min, int max)

//          - int getInt()

//          - double getDouble(double min, double max)

//          - double getDouble()


    public String getString() {
        return this.scan.nextLine();
    }


    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scan.nextLine();
    }


    public boolean yesNo(){
        String input = this.scan.next();

        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);

        String input = this.scan.next();

        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }


    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);

        int userInput = this.scan.nextInt();

        if(userInput > max || userInput < min){
            return getInt(min, max);
        } else {
            return userInput;
        }
    }


    public int getInt() {
        return this.scan.nextInt();
    }

    public double getInt(String prompt) {
        System.out.println(prompt);
        return this.scan.nextInt();
    }


    public double getDouble(double min, double max) {
        System.out.println("Please input a decimal number between " + min + " and " + max);

        double userInput = this.getDouble();

        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble(){
        return this.scan.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return this.scan.nextDouble();
    }
}
