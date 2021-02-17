package hackerRank.shapes;

import java.util.List;

public abstract class Polygon {

    private List<Double> sides;

    public List<Double> getSides() {
        return sides;
    }

//    public Polygon(List<Double> sides) {
//        this.sides = sides;
//    }

    public abstract double area();

    public abstract double perimeter();
}

