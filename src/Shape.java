public abstract class Shape extends Point {
    public String color;
    public abstract int hashcode(int result);
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract String paint(String color);

    @Override
    public String toString(){
        return "Color of this shape is " + color;
    }
}
