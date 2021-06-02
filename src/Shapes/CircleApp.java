package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of your circle?");
        Input in = new Input();

        Circle circle = new Circle(in.getDouble());

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
