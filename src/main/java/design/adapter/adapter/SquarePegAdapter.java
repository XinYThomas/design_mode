package design.adapter.adapter;

import design.adapter.square.SquarePeg;
import design.adapter.round.RoundPeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
