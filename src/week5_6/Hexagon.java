package week5_6;

public class Hexagon extends Shape {
    private double canh;

    public Hexagon(){
        super();
    }

    public Hexagon(String color , boolean filled , Point p){
        super(color,filled,p);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
}
