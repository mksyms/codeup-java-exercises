package grades;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {

    }

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
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}




//        Iterator iterator = this.grades.iterator();
//
//        System.out.println(grades);
//
//        while (iterator.hasNext())
//            System.out.print(iterator.next() + " ");
//
//        return double getGradeAverage


