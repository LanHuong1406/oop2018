package week4.task2;

public class Circle extends Shape {
    private double radius = 1.0;
    final double PI = 3.14;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color , boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //tinh dien tich
    public double getArea(){
        double x = PI * getRadius() * getRadius();

        return x;
    }

    //tinh chu vi
    public double getPerimeter(){
        double x = 2 * PI * getRadius();
        return x;
    }

    public String toString(){
        return super.toString() + " Radius: " + radius;
    }


}
