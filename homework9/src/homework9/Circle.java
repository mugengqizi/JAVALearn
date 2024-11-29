package homework9;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distanceTo(Point P) {
        return Math.sqrt((P.x - this.x) * (P.x - this.x) + (P.y - this.y) * (P.y - this.y));
    }
}

class Circle {
    private Point center;
    private double r;

    private static final double pai = 3.1415926;

    public Circle() {
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    //周长
    public double perimeter() {
        return this.r * 2 * pai;
    }

    //面积
    public double area() {
        return this.r * this.r * pai;
    }

    //是否在圆内
    public boolean containsPoint(Point p) {
        return this.center.distanceTo(p) <= this.r;
    }

    //当前圆是否和另一个圆相交
    public boolean isIntersect(Circle c) {
        return this.center.distanceTo(c.center) < this.r + c.r;
    }
}

class Test {
    public static void main(String[] args) {
        //圆c1
        Point p1 = new Point(0, 0);
        Circle c1 = new Circle(p1, 3);
        System.out.println("圆c1的周长是：" + c1.perimeter());
        System.out.println("圆c1的面积是：" + c1.area());
        //圆c2
        Point p2 = new Point(6, 0);
        Circle c2 = new Circle(p2, 3);
        System.out.println("圆c2的周长是：" + c2.perimeter());
        System.out.println("圆c2的面积是：" + c2.area());
        Point p3 = new Point(1, 3);
        //判断点p3是否在圆c1内
        if (c1.containsPoint(p3)) {
            System.out.println("p3在圆c1内");
        } else {
            System.out.println("p3不在圆c1内");
        }
        //判断c1与c2是否相交
        if (c1.isIntersect(c2)) {
            System.out.println("c1与c2相交");
        } else {
            System.out.println("c1与c2不相交");
        }
    }
}