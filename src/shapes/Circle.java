package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    area = pi x (radius ^ 2)
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }


//    circumference = 2 x pi x radius
    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

}




//package shapes;
//
//public class Circle {
//    private double radius;
//    private static int circleCount;
//
//    public Circle(double radius) {
//        this.radius = radius;
//        Circle.circleCount++;
//    }
//
//
//    public double getArea() {
//        return Math.PI * (this.radius * this.radius);
//    }
//
//    public double getCircumference() {
//        double circumference = 2 * Math.PI * this.radius;
//        return circumference;
//    }
//
//    public static int getCircleCount() {
//        return Circle.circleCount;
//    }
//}
