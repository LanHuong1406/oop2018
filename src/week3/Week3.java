package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n)
            return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for (int i = 1 ; i < array.length ; i++ ){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double bmi = weight / (height * height);
        if (bmi > 0 && bmi < 18.5)
            return "Thieu can";
        else if (bmi >= 18.5 && bmi < 23)
            return "Binh thuong";
        else if (bmi >= 23 && bmi <= 24.99)
            return "Thua can";
        else if (bmi > 25)
            return "Beo phi";
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = -2;
        arr[2] = 4;
        arr[3] = -1;

        System.out.println(max(2,3));
        System.out.println(minOfArray(arr));
        System.out.println(calculateBMI(80,1.6));
    }
}
