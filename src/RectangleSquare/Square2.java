package RectangleSquare;

public class Square2 {

    private double width;

    public Square2(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double computePerimeter(){
        return 4*this.width;
    }

    public double computeArea(){
        return (this.width)*(this.width);
    }
}
