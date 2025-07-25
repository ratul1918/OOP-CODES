public class Assignment {

    // Point class representing a coordinate in 2D space..
    public static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Calculate Euclidean distance between this point and another point
        public double distance(Point p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        }
    }

    // Circle class with center and radius
    public static class Circle {
        public Point center;
        public double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        // Check if a point lies inside or on the circle
        public boolean pointInsideCircle(Point p) {
            return center.distance(p) <= radius;
        }

        // Check if another circle lies completely inside this circle
        public boolean circleInsideCircle(Circle C) {
            double distance = center.distance(C.center);
            return distance + C.radius <= this.radius;
        }
    }

    // Rectangle class defined by bottom-left and top-right points
    public static class Rectangle {
        public Point bottomLeft, topRight;

        public Rectangle(Point bottomLeft, Point topRight) {
            this.bottomLeft = bottomLeft;
            this.topRight = topRight;
        }

        // Check if a circle lies completely within the rectangle
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

        // Check if another rectangle lies completely inside this rectangle
        public boolean rectangleInsideRectangle(Rectangle R) {
            return R.bottomLeft.x >= this.bottomLeft.x &&
                   R.bottomLeft.y >= this.bottomLeft.y &&
                   R.topRight.x <= this.topRight.x &&
                   R.topRight.y <= this.topRight.y;
        }
    }

    // Represents a Bangladeshi flag consisting of a rectangle and a circle
    public static class BangladeshiFlag {
        public Rectangle R;
        public Circle C;

        public BangladeshiFlag(Rectangle R, Circle C) {
            this.R = R;
            this.C = C;
        }

        // Check if the flag is "balanced" — i.e., circle is centered and inside the rectangle
        public boolean isBalanced() {
            int rectCenterX = (R.bottomLeft.x + R.topRight.x) / 2;
            int rectCenterY = (R.bottomLeft.y + R.topRight.y) / 2;
            boolean isCentered = (C.center.x == rectCenterX && C.center.y == rectCenterY);
            return isCentered && R.circleInsideRectangle(C);
        }
    }

    public static void main(String[] args) {
        // Test 1: Distance between two points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 3);
        System.out.println(p1.distance(p2)); // Expected: 5.0

        // Test 2: Point inside circle
        Circle circle = new Circle(new Point(5, 5), 3);
        System.out.println(circle.pointInsideCircle(new Point(6, 6))); // Expected: true

        // Test 3: Circle inside another circle
        Circle smallCircle = new Circle(new Point(5, 5), 2);
        System.out.println(circle.circleInsideCircle(smallCircle)); // Expected: true

        // Test 4: Circle inside rectangle
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(10, 10));
        System.out.println(rectangle.circleInsideRectangle(circle)); // Expected: true

        // Test 5: Rectangle inside rectangle
        Rectangle smallRectangle = new Rectangle(new Point(2, 2), new Point(8, 8));
        System.out.println(rectangle.rectangleInsideRectangle(smallRectangle)); // Expected: true

        // Test 6: Is Bangladeshi flag balanced
        BangladeshiFlag flag = new BangladeshiFlag(rectangle, circle);
        System.out.println(flag.isBalanced()); // Expected: true.
    }
}
