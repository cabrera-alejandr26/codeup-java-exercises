package Shapes;

public class Rectangle {
    protected int Length;
    protected int Width;

    Rectangle(int L, int W){
        this.Length = L;
        this.Width = W;
    }

    public int getArea(){
        return Length * Width;
    }

    public int getPerimeter(){
        return (2 * Length) + (2 * Width);
    }

}
