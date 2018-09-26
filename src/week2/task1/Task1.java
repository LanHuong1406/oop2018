package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int uc = 0;
        for (int i = 1 ; i <= a || i <= b ; i++){
            if( a % i == 0 && b % i == 0)
                uc = i;
        }
        return uc;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0)
            return 0;
        else return (n == 1)?1:(fibonacci(n-1)+fibonacci(n-2));
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        int uc = gcd(x,y);
        System.out.println(uc);

        int a = 0;
        int fi = fibonacci(a);
        System.out.println(fi);
    }
}
