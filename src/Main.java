public class Main {
    public static void main(String[] args) {
        int arraySize = 1;
        Shape[] shapes = new Shape[arraySize];

        for(int i = 0; i< arraySize;i++) {

            Circle circle = new Circle();
            circle.radius(0.0,5.0,0.0,0.0);
            circle.paint("Black");
            System.out.println("\nPerimeter of Circle: " + circle.calculatePerimeter());
            System.out.println("Area of Circle: " + circle.calculateArea());
            System.out.println(circle.toString());
            System.out.println("Result of hashcode: " + circle.hashcode(31));


            Rectangle rectangle = new Rectangle();
            rectangle.side1(0.0,5.0,0.0,0.0);
            rectangle.side2(5.0,5.0,0.0,8.0);
            rectangle.paint("White");
            System.out.println("\nPerimeter of Rectangle: " + rectangle.calculatePerimeter());
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
            System.out.println(rectangle.toString());
            System.out.println("Result of hashcode: " + rectangle.hashcode(22));

            Triangle triangle = new Triangle();
            triangle.side1(1.0, 3.0, 2.0,-1.0);
            triangle.side2(1.0,5.0,2.0, 5.0);
            triangle.side3(3.0,5.0, -1.0, 5.0);
            triangle.paint("Grey");
            System.out.println("\nPerimeter of Triangle: " + triangle.calculatePerimeter());
            System.out.println("Area of Triangle: " + triangle.calculateArea());
            System.out.println(triangle.toString());
            System.out.println("Result of hashcode: " + triangle.hashcode(41));
        }
    }
    }
