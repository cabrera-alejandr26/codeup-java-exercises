package Shapes;

abstract class Shape {
    abstract class Quadrilateral extends Shape implements Measurable {
        protected int lenght;
        protected int width;

        Quadrilateral(int L, int W) {
            int len = this.lenght = L;
            int wid = this.width = W;
        }

    }
}
