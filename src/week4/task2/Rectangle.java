package week4.task2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenth = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width , double lenth){
        this.lenth = lenth;
        this.width = width;
    }

    public Rectangle(double width ,double lenth, String color , boolean filled){
        this.width = width;
        this.lenth = lenth;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getArea(){
        double S = getLenth() * getWidth();
        return S;
    }

    public double getPerimeter(){
        double C = 2 * (getWidth() + getLenth());
        return C;
    }

    public String toString(){
        return null;
    }
}
