package design.prototype.shapes;

import java.util.Objects;
// 通用形状接口
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Shape)) return false;
        Shape s = (Shape) o;
        return x == s.x && y == s.y && Objects.equals(color, s.color);
    }

}
