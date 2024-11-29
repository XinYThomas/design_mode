package design.adapter;

import design.adapter.adapter.SquarePegAdapter;
import design.adapter.round.RoundHole;
import design.adapter.round.RoundPeg;
import design.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);

        if(hole.fit(peg)) {
            System.out.println("fit");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter  smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if(hole.fit(smallSqPegAdapter)) {
            System.out.println("fit");
        }
        if(!hole.fit(largeSqPegAdapter)) {
            System.out.println("no fit");
        }
    }
}
