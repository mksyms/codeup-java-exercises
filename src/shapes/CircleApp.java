package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("welcome to codeup circle class! class is in session!");
        Input input = new Input();


        double radius = input.getDouble("please enter a radius for your circle");

        Circle constructedNewCircle = new Circle(radius);
                System.out.println(constructedNewCircle.getArea() + " is the area of your circle");

                System.out.println(constructedNewCircle.getCircumference() + " is is the circumference of your circle");
    }



    }














//public class CircleApp {
//
//        public static void main(String[] args) {
//            System.out.println("Welcome to Codeup Circle Class! Class is in session!");
//            Input input = new Input();
//            Scanner sc = new Scanner(System.in);
//
//            do {
//                double radius = input.getInt("Please enter the radius for your circle");
//
//                Circle creatingACircle = new Circle(radius);
//
//                System.out.println(creatingACircle.getArea() + " is the area of your circle");
//
//                System.out.println(creatingACircle.getCircumference() + " is is the circumference of your circle");
//
//            } while (input.yesNo("would you like to keep going? [y/n]"));
//
//            int circleCount = Circle.getCircleCount();
//            System.out.println("Thanks for using CircleApp™. You created " + circleCount + " circle objects.");
//        }
//}