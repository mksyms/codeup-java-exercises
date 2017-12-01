package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

import static grades.GradesApplication.displayPrompt;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student sukari = new Student("Sukari");
        Student steve = new Student("Steve");
        Student tito = new Student("Tito");
        Student po = new Student("Po");

        sukari.addGrade(100);
        sukari.addGrade(100);
        sukari.addGrade(100);
        sukari.addGrade(100);

        steve.addGrade(100);
        steve.addGrade(100);
        steve.addGrade(100);
        steve.addGrade(100);

        tito.addGrade(100);
        tito.addGrade(100);
        tito.addGrade(100);
        tito.addGrade(100);

        po.addGrade(0);
        po.addGrade(0);
        po.addGrade(0);
        po.addGrade(-100);

        students.put("sukOnMI", sukari);
        students.put("andSTEVEWillWalk500Miles", steve);
        students.put("titosAndAzz", tito);
        students.put("potheticPooPooPeePeeButtHead", po);


        System.out.println();
        System.out.println("Welcome!");

        displayPrompt(students);
    }

        public static void displayPrompt(HashMap<String, Student> students) {
            Input input = new Input();
            String userInput;

        System.out.println();
        System.out.println("Here are the github usernames of our students: \n \n"
                + "|sukOnMI| "
                + "|andSTEVEWillWalk500Miles| "
                + "|titosAndAzz| "
                + "|potheticPooPooPeePeeButtHead|");

        System.out.println();
        System.out.println("What student would you like to see more information on?");

        userInput = input.getString();
            if(students.containsKey(userInput)) {
                for (Map.Entry<String, Student> e : students.entrySet()) {
                    if (e.getKey().equals(userInput)) {
                        System.out.println();
                        System.out.printf("Name: %s - Github Username: %s%n",e.getValue().getName(),e.getKey());
                        System.out.printf("Current Average: %d%n%n",(int) e.getValue().getGradeAverage());
                    }
                }
            } else {
                System.out.printf("Sorry, no student found with the github username of " + userInput);
                displayPrompt(students);
            }

            System.out.println("Would you like to see another student?");

            if (input.yesNo()){
                displayPrompt(students);
            }

            System.out.println("Goodbye, and have a wonderful day!");}


}
