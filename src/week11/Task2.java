package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable> void maxMin(ArrayList<T> arr){
        T max = arr.get(0);
        for (int i = 0; i < arr.size(); i++ ){
            if (max.compareTo(arr.get(i)) < 0){
                max = arr.get(i);
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("\n");

    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(-2);
        list1.add(3);
        list1.add(1);
        list1.add(5);
        maxMin(list1);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(-2.3);
        list2.add(4.6);
        list2.add(3.7);
        list2.add(-0.5);
        maxMin(list2);

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('a');
        list3.add('z');
        list3.add('c');
        maxMin(list3);
    }
}
