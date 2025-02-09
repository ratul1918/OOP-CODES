public class Assignment {

    public static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        }
    }

    public static class Circle {
        public Point center;
        public double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public boolean pointInsideCircle(Point p) {
            return center.distance(p) <= radius;
        }

        public boolean circleInsideCircle(Circle C) {
            double distance = center.distance(C.center);
            return distance + C.radius <= this.radius;
        }
    }

    public static class Rectangle {
        public Point bottomLeft, topRight;

        public Rectangle(Point bottomLeft, Point topRight) {
            this.bottomLeft = bottomLeft;
            this.topRight = topRight;
        }

        public boolean circleInsideRectangle(Circle C) {
            double left = bottomLeft.x;
            double right = topRight.x;
            double bottom = bottomLeft.y;
            double top = topRight.y;

            double circleLeft = C.center.x - C.radius;
            double circleRight = C.center.x + C.radius;
            double circleBottom = C.center.y - C.radius;
            double circleTop = C.center.y + C.radius;

            return circleLeft >= left && circleRight <= right &&
                    circleBottom >= bottom && circleTop <= top;
        }

        public boolean rectangleInsideRectangle(Rectangle R) {
            return R.bottomLeft.x >= this.bottomLeft.x &&
                    R.bottomLeft.y >= this.bottomLeft.y &&
                    R.topRight.x <= this.topRight.x &&
                    R.topRight.y <= this.topRight.y;
        }
    }

    public static class BangladeshiFlag {
        public Rectangle R;
        public Circle C;

        public BangladeshiFlag(Rectangle R, Circle C) {
            this.R = R;
            this.C = C;
        }

        public boolean isBalanced() {
            int rectCenterX = (R.bottomLeft.x + R.topRight.x) / 2;
            int rectCenterY = (R.bottomLeft.y + R.topRight.y) / 2;
            boolean isCentered = (C.center.x == rectCenterX && C.center.y == rectCenterY);
            return isCentered && R.circleInsideRectangle(C);
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 3);
        System.out.println(p1.distance(p2));

        Circle circle = new Circle(new Point(5, 5), 3);
        System.out.println(circle.pointInsideCircle(new Point(6, 6)));

        Circle smallCircle = new Circle(new Point(5, 5), 2);
        System.out.println(circle.circleInsideCircle(smallCircle));

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(10, 10));
        System.out.println(rectangle.circleInsideRectangle(circle));

        Rectangle smallRectangle = new Rectangle(new Point(2, 2), new Point(8, 8));
        System.out.println(rectangle.rectangleInsideRectangle(smallRectangle));

        BangladeshiFlag flag = new BangladeshiFlag(rectangle, circle);
        System.out.println(flag.isBalanced());
    }
}
