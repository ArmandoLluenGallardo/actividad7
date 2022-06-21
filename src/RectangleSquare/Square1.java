package RectangleSquare;

public class Square1 extends Rectangle1 {

    public Square1 (double side) {
        super(side, side);
    }

    public void setWidth (double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    public void setHeight(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
