public abstract class Shape extends Point {
    // RGB Values(r, g, b) from https://www.color-name.com
     public String convertRGBToHEX(int r, int g, int b){
      String hex = String.format("#%02X%02X%02X", r, g, b);
       return hex;
    }
    public abstract int hashcode(int result);
    public abstract double calculatePerimeter();
    public abstract double calculateArea();



}

