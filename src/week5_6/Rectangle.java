package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Rectangle extends Shape {
    private double width;
    private double lenth;

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
        return super.toString() + ", Width: " + width + ", Length: " + lenth;
    }
}
