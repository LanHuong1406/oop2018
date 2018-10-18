package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Triangle extends Shape {
    private Point point1,point2,point3;

    public Triangle(){
        this.point1 = new Point(0,1);
        this.point2 = new Point(1,0);
        this.point3 = new Point(-1,0);
    }

    public Triangle(Point p1, Point p2, Point p3){
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
    }

    public Triangle(String color, boolean filled , Point p ){
        super(color,filled,p);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public boolean ssTriangle(Shape p) {
        Triangle p1 = (Triangle) p;
        if (this.getPoint1() == p1.getPoint1()&&this.getPoint2() == p1.getPoint2()
                &&this.getPoint3() == p1.getPoint3()){
            return true;
        }
        return false;
    }
}
