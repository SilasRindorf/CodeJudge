public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public boolean equals(Point p) {
        return x == p.x && y == p.y;
    }
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}