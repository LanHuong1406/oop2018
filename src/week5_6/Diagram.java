package week5_6;

import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Diagram {

   public ArrayList<Layer> arrlayer = new ArrayList<Layer>();

   public void pushArray(Layer arr){
       arrlayer.add(arr);
   }

   public void deleteCircle(){
       for (Layer arr : arrlayer){
           arr.deCircle();
       }
   }


   public void kiemtra(){
       int dem = 0 ;
       for (int i = 0 ; i < arrlayer.size() ; i++ ){
           if (arrlayer.get(i).kiemtraCircle() == false){
               dem++;
           }
       }
       if (dem == 0)
           System.out.println("Da xoa het Circle!!!");
       else System.out.println("Chua xoa het Circle..." + dem);
   }

}
