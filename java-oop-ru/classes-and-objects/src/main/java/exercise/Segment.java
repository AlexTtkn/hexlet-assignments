package exercise;

// BEGIN
public class Segment {
    private final Point p1;
    private final Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getBeginPoint() {
        return this.p1;
    }

    public Point getEndPoint() {
        return this.p2;
    }

    public Point getMidPoint() {
        int newX = (p1.getX() + p2.getX()) / 2;
        int newY = (p1.getY() + p2.getY()) / 2;
        return new Point(newX, newY);
    }
}
// END
