package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Square extends Rectangle {
    double side;

    public Square(){
        super();
    }

    public Square(double side, String color, boolean filled , Point p){
        super(side,side,color,filled,p);
    }

    public boolean ssSquare(Shape q){
        Square q1 = (Square) q;
        if (this.getLenth() == q1.getWidth())
            return true;
        return false;
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
