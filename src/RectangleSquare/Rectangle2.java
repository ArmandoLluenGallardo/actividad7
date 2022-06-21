package RectangleSquare;
public class Rectangle2 extends Square2 {
    private double height;

    public Rectangle2(double width, double height) {
        super(width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeArea() {
        return getWidth() * height;
    }

    public double computePerimeter() {
        return 2 * (getWidth() + height);
    }

}
