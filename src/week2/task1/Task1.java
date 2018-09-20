package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while(b > 0){
            int tem = a % b;
            a = b;
            b = tem;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0)
            return 0;
        else return (n == 1)?1:(fibonacci(n-1)+fibonacci(n-2));
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int uc = gcd(x,y);
        System.out.println(uc);

        int a = 2;
        int fi = fibonacci(a);
        System.out.println(fi);
    }
}
