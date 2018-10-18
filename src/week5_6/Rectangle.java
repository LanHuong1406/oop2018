package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenth = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width , double lenth){
        this.lenth = lenth;
        this.width = width;
    }

    public Rectangle(double width ,double lenth, String color , boolean filled , Point p){
        this.width = width;
        this.lenth = lenth;
        setPoint(p);
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

    public boolean ssRectangle(Shape r1){
        Rectangle r = (Rectangle)r1;
        if (this.getLenth() == r.getLenth() &&
                this.getWidth() == r.getWidth() && this.getPoint() == r.getPoint())
            return true;
        return false;
    }

    public String toString(){
        return super.toString() + ", Width: " + width + ", Length: " + lenth;
    }
}
