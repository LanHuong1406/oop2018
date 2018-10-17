package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Triangle extends Shape {
    private int a,b,c;

    public Triangle(){

    }
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color , boolean filled,Point p){
        super(color,filled);
        Point point = p;
    }
}
