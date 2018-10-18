package week5_6;


public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4);
        Point p1 =  new Point(0,2);
        Point p2 = new Point(1,5);
        Point p3 = new Point(2,4);
        Triangle t1 = new Triangle(p1,p2,p3);
        Triangle t2 = new Triangle();

        Layer layer = new Layer();
        layer.addArray(c1);
        layer.addArray(c2);
        layer.addArray(t1);
        layer.addArray(t2);

        layer.deTriangle();
        System.out.println(layer.kiemtraTriangle());

        Rectangle r1 = new Rectangle(3,5);
        Triangle t3 = new Triangle();
        Circle c = new Circle(6);

        Layer layer1 = new Layer();
        layer1.addArray(r1);
        layer1.addArray(t3);
        layer1.addArray(c);

        Diagram diagram = new Diagram();
        diagram.pushArray(layer);
        diagram.pushArray(layer1);

        diagram.deleteCircle();
        diagram.kiemtra();



    }
}
