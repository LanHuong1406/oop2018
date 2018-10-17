package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Square extends Rectangle {
    double side;

    public Square(){

    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLenth(side);
    }

    public String toString(){
        return super.toString();
    }
}
