package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;
    private Point point;

    public Shape(){
    }

    public Shape(String color , boolean filled , Point point){
        this.color = color;
        this.filled = filled;
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}
