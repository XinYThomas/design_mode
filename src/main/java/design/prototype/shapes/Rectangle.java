package design.prototype.shapes;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle() {}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle();
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.width == this.width && rectangle.height == this.height;
    }
}
