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

    //ham xoa tam giac

    public int deTriangle(){
        int dem = 0;
        for (int i = 0 ; i < shapes.size() ; i++ ){
            if (shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                dem++;
                i--;
            }
        }
        return dem;
    }

    //ham xoa hinh tron

    public int deCircle(){
        int dem = 0;
        for (int i = 0 ; i < shapes.size() ; i++ ){
            if (shapes.get(i) instanceof Circle){
                shapes.remove(i);
                dem++;
                i--;
            }
        }
        return dem;
    }

    //
    
}

