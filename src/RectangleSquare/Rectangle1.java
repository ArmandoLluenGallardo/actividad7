package RectangleSquare;

public class Rectangle1 {
    private double width, height;

    public Rectangle1 (double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getWidth () {
        return width;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double computePerimeter () {
        return 2 * (width + height);
    }

    public double computeArea () {
        return width * height;
    }
}
