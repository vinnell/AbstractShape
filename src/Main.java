public class Main {
    public static void main(String[] args) {

        Double secondDouble = Double.valueOf(65.877565);
        Double thirdDouble = Double.valueOf("5.8");
        System.out.println(secondDouble);
        System.out.println(thirdDouble);
        int g = secondDouble.intValue();
        long l = secondDouble.longValue();
        short s = secondDouble.shortValue();
        byte b = secondDouble.byteValue();
        float f = secondDouble.floatValue();

        System.out.println(secondDouble);
        System.out.println("The int value is " + g);
        System.out.println("The long value is " + l);
        System.out.println("The short value is " + s);
        System.out.println("The byte value is " + b);
        System.out.println("The float value is " + f);

        double forthDouble = Double.parseDouble("5.88");
        System.out.println(forthDouble);
        String pi = Double.toString(Math.PI);
        System.out.println("The string value is " + pi);

        int arraySize = 1;
        Shape[] shapes = new Shape[arraySize];

        for(int i = 0; i< arraySize;i++) {

            Circle circle = new Circle();
            circle.radius(0.0,5.0,0.0,0.0);
            System.out.println("\nPerimeter of Circle: " + circle.calculatePerimeter());
            System.out.println("Area of Circle: " + circle.calculateArea());
            System.out.println("Result of hashcode: " + circle.hashcode(31));
            System.out.println("This shape is " + Color.RED);
            System.out.println("Color in format HEX: " + circle.convertRGBToHEX(227,25,55));

            Rectangle rectangle = new Rectangle();
            rectangle.side1(0.0,5.0,0.0,0.0);
            rectangle.side2(5.0,5.0,0.0,8.0);
            System.out.println("\nPerimeter of Rectangle: " + rectangle.calculatePerimeter());
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
            System.out.println("Result of hashcode: " + rectangle.hashcode(22));
            System.out.println("This shape is " + Color.GREEN);
            System.out.println("Color in format HEX: " + rectangle.convertRGBToHEX(102,165,134));


            Triangle triangle = new Triangle();
            triangle.side1(1.0, 3.0, 2.0,-1.0);
            triangle.side2(1.0,5.0,2.0, 5.0);
            triangle.side3(3.0,5.0, -1.0, 5.0);
            System.out.println("\nPerimeter of Triangle: " + triangle.calculatePerimeter());
            System.out.println("Area of Triangle: " + triangle.calculateArea());
            System.out.println("Result of hashcode: " + triangle.hashcode(41));
            System.out.println("This shape is " + Color.WHITE);
            System.out.println("Color in format HEX: " + triangle.convertRGBToHEX(242,240,235));

        }
        }
    }

