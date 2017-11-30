package shapes;

import util.Input;

public class CircleApp {

        public static void main(String[] args) {
            System.out.println("Welcome to Codeup Circle Class! Class is in session!");
            Input input = new Input();

            do {
                double radius = input.getInt("Please enter for your circle");

                Circle creatingACircle = new Circle(radius);

                System.out.println(creatingACircle.getArea() + " is the area of your circle");

                System.out.println(creatingACircle.getCircumference() + " is is the circumference of your circle");

            } while (input.yesNo("would you like to keep going? [y/n]"));

            int circleCount = Circle.getCircleCount();
            System.out.println("Thanks for using CircleApp™. You created " + circleCount + " circle objects.");
        }
}