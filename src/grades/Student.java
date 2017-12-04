package grades;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

//        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

        for (int grade : grades) {
            sumOfAllGrades += grade;
        }

        average = sumOfAllGrades / numberOfGrades;
        return average;
    }
}

//    public static void main(String[] args) {
//        System.out.println("Testing the Student Class");
//        Student student = new Student ("Maggie");
//
//        System.out.println("make sure we start with an empty arraylist of grades");
//        System.out.println("the number of elements inthe grades array is " + student.grades.size());
//
//        System.out.println("Now we'll add 3 grades, a 90, a 95, and an 82");
//        student.addGrade(90);
//        student.addGrade(95);
//        student.addGrade(82);
//
//        double expectedGrade =
//
//    }





//        Iterator iterator = this.grades.iterator();
//
//        System.out.println(grades);
//
//        while (iterator.hasNext())
//            System.out.print(iterator.next() + " ");
//
//        return double getGradeAverage


