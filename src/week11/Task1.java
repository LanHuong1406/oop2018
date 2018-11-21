package week11;

public class Task1 {
    public static <T extends Comparable> void sapXep(T[] arr){
        for (int i = 0; i < arr.length - 1; i++ ){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    T tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
    }

    public static <T> void In(T[] arr){
        for (int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Integer[] integers = {2,4,0,1,4,5,3};
        sapXep(integers);
        In(integers);

        Character[] characters = {'b','h','a','c','f'};
        sapXep(characters);
        In(characters);

        Double[] doubles = {1.23,-0.25,4.5,-2.0,6.5};
        sapXep(doubles);
        In(doubles);

    }
}
