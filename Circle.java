public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle Color: " + color + " Radius: " + radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
