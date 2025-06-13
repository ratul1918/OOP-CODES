// Assignment class...

class Shape2D {
    protected int length;
    protected int width;

    public Shape2D(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}

class Rectangle extends Shape2D {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int area() {
        return super.area();
    }

    @Override
    public int perimeter() {
        return super.perimeter();
    }

    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }
}

class Circle extends Shape2D {
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public int area() {
        return (int) (Math.PI * length * length);
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * length);
    }
}

class Triangle extends Shape2D {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public int area() {
        return (int) (0.5 * length * width);
    }

    @Override
    public int perimeter() {
        return -1;
    }
}

class Shape3D extends Shape2D {
    protected int height;

    public Shape3D(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int volume() {
        return super.area() * height;
    }

    public int surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Cuboid extends Shape3D {
    public Cuboid(int length, int width, int height) {
        super(length, width, height);
    }

    @Override
    public int volume() {
        return super.volume();
    }

    @Override
    public int surfaceArea() {
        return super.surfaceArea();
    }
}

class Sphere extends Shape3D {
    public Sphere(int radius) {
        super(radius, radius, radius);
    }

    @Override
    public int volume() {
        return (int) ((4.0 / 3.0) * Math.PI * Math.pow(length, 3));
    }

    @Override
    public int surfaceArea() {
        return (int) (4 * Math.PI * Math.pow(length, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Diagonal: " + rectangle.diagonal());

        Circle circle = new Circle(3);
        System.out.println("\nCircle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle(6, 4);
        System.out.println("\nTriangle Area: " + triangle.area());

        Cuboid cuboid = new Cuboid(3, 4, 5);
        System.out.println("\nCuboid Volume: " + cuboid.volume());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());

        Sphere sphere = new Sphere(3);
        System.out.println("\nSphere Volume: " + sphere.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
    }
}
