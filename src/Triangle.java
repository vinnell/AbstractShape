public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    public double side1(double x1, double x2, double y1, double y2) {
        side1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return side1;
    }
    public double side2(double x1, double x3, double y1, double y3) {
        side2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        return side2;
    }
    public double side3(double x2, double x3, double y2, double y3) {
        side3 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        return side3;
    }

    @Override
    public int hashcode(int result){
        result = 51 * result + (int)(Double.doubleToLongBits(side1)>>>32);
        result = 51 * result + (int)(Double.doubleToLongBits(side2)>>>32);
        result = 51 * result + (int)(Double.doubleToLongBits(side3)>>>32);
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null|| this.getClass() != obj.getClass())
            return  false;
        Triangle tri = (Triangle) obj;
        if (this.side1 != tri.side1)
            return false;
        if (this.side2 != tri.side2)
            return false;
        return (this.side3 == tri.side3);
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = side1 + side2 + side3; // Calculate Perimeter of triangle
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));// Calculate Area of triangle
        return area;
    }
    @Override
    public String paint(String color){
        this.color = color;
        return color;
    }
}
