package week5_6;

import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Layer {
    private ArrayList<Shape> shapes;
    public boolean visible;

    public Layer(){
        this.shapes = new ArrayList<>();
        this.visible = true;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void addArray(Shape shape){
        shapes.add(shape);
    }

    //ham xoa tam giac

    public void deTriangle(){
        for (int i = 0 ; i < shapes.size() ; i++ ){
            if (shapes.get(i) instanceof Triangle){
                shapes.remove(i);

                i--;
            }
        }

    }

    //ham xoa hinh tron

    public void deCircle(){
        for (int i = 0 ; i < shapes.size() ; i++ ){
            if (shapes.get(i) instanceof Circle){
                shapes.remove(i);
                i--;
            }
        }
    }

    public boolean kiemtraCircle(){
        int dem = 0 ;
        for (int i = 0 ; i < shapes.size() ; i++){
            if (shapes.get(i) instanceof Circle){
                dem++;
            }
        }
        if (dem == 0)
            return true;
        return false;
    }

    public int kiemtraTriangle(){
        int dem = 0 ;
        for (int i = 0 ; i < shapes.size() ; i++ ){
            if (shapes.get(i) instanceof Triangle)
                dem++;
        }
        return dem;
    }

    //ham xoa cac hinh giong nhau

    public void deleteShape() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                for (int j = 0; j < shapes.size() && j != i; j++) {
                    if (((Circle) shapes.get(i)).ssCircle(shapes.get(j))) {
                        shapes.remove(j);
                    }
                }
            }

            if (shapes.get(i) instanceof Rectangle){
                if (shapes.get(i) instanceof Circle){
                    for (int j = 0 ; j < shapes.size() && j != i ; j++ ){
                        if (((Circle) shapes.get(i)).ssCircle(shapes.get(j))){
                            shapes.remove(j);
                        }
                    }
                }
            }
        }
    }
}

