package Shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle theShape = new Rectangle(4,6);
        System.out.println(theShape.getArea());

        Square theEvenRec = new Square(5);
        System.out.println(theEvenRec.getArea());

        //Creating box1
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        //Creating Box2
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}
