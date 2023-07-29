package exercise;

// BEGIN
public class Segment {
    Point p1;
    Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getBeginPoint() {
        return p1;
    }

    public Point getEndPoint() {
        return p2;
    }

    public Point getMidPoint() {
        return new Point((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
    }
}
// END
