package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

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
        System.out.println("Here are the github usernames of our students: \n"
                + "|sukOnMI| "
                + "|andSTEVEWillWalk500Miles| "
                + "|titosAndAzz| "
                + "|potheticPooPooPeePeeButtHead|");

        System.out.println("What student would you like to see more information on?");

    }
}
