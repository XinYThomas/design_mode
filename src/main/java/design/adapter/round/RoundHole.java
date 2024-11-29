package design.adapter.round;

// 圆孔

public class RoundHole {
    private double radius;
    public RoundHole(double radius) {
        this.radius = radius;
    }
    private double getRadius() {
        return radius;
    }

    public boolean fit(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
