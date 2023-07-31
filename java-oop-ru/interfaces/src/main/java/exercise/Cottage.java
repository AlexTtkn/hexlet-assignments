package exercise;

// BEGIN
public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(this.area, another.getArea());
    }


    @Override
    public String toString() {
        return this.floorCount +
                " этажный коттедж площадью " +
                getArea() +
                " метров";
    }
}
// END
