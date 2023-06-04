public class Rectangle extends Shape {
    double side1;
    double side2;
    public double side1(double x1, double x2, double y1, double y2) {
        side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return side1;
    }
    public double side2(double x2, double x3, double y2, double y3) {
        side2 = side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        return side2;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null|| this.getClass() != obj.getClass())
            return  false;
        Rectangle rec = (Rectangle) obj;
        if (this.side1 != rec.side1)
            return false;
        return (this.side2 == rec.side2);
    }
    @Override
    public int hashcode(int result){
        result = 37 * result + (int)(Double.doubleToLongBits(side1)>>>32);
        result = 37 * result + (int)(Double.doubleToLongBits(side2)>>>32);
        return result;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = (side1 + side2) * 2; // Calculate Perimeter of Rectangle
        return perimeter;
    }

    @Override
    public double calculateArea() {
       double area = side1 * side2;// Calculate Area of Rectangle
       return area;
    }

}
