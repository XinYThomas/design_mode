package design.prototype.shapes;

import java.util.Objects;

public class Circle extends Shape {
    public int radius;
    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        if(circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Circle) || !super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }


}
