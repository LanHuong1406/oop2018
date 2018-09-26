package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator * other.denominator + other.numerator * this.denominator;
        int M = this.denominator * other.denominator;
        Fraction sum = new Fraction(T, M);
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator * other.denominator - other.numerator * this.denominator;
        int M = this.denominator * other.denominator;
        Fraction hieu = new Fraction(T, M);
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator * other.numerator;
        int M = this.denominator * other.denominator;
        Fraction tich = new Fraction(T, M);
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator * other.denominator;
        int M = this.denominator * other.numerator;
        Fraction chia = new Fraction(T, M);
        return chia;
    }

    public static int rutGon(int x, int y) {
        return ((y == 0) ? x : rutGon(y, x % y));
    }


    public static void In(int x, int y) {
        if (x == 0)
            System.out.println(0);
        else if (y == 1)
            System.out.println(x);
        else if(x < 0 && y < 0)
            System.out.println(-x + "/" + -y);
        else if(x > 0 && y < 0)
            System.out.println(-x + "/" + -y);
        else System.out.println(x + "/" + y);
    }

    public boolean equals(Object obj) {
        Fraction ps = (Fraction)obj;
        if (this.denominator != 0 && ps.denominator != 0) {
            if (this.numerator * ps.denominator - this.denominator * ps.numerator == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Fraction p1 = new Fraction(1, 3);
        Fraction p2 = new Fraction(1, 2);
        //ham cong
        Fraction m1 = p1.add(p2);
        int tem1 = rutGon(m1.numerator, m1.denominator);
        Fraction.In(m1.numerator / tem1, m1.denominator / tem1);
        //ham tru
        Fraction m2 = p1.subtract(p2);
        int tem2 = rutGon(m2.numerator, m2.denominator);
        Fraction.In(m2.numerator / tem2, m2.denominator / tem2);
        //ham nhan
        Fraction m3 = p1.multiply(p2);
        int tem3 = rutGon(m3.numerator, m3.denominator);
        Fraction.In(m3.numerator / tem3, m3.denominator / tem3);
        //ham chia
        Fraction  m4 = p1.divide(p2);
        int tem4 = rutGon(m4.numerator,m4.denominator);
        Fraction.In(m4.numerator/tem4,m4.denominator/tem4);
        //so soanh
        Fraction ps1 = new Fraction(1,2);
        Fraction ps2 =new Fraction(2,4);
        Fraction ps3 = new Fraction(3,4);
        System.out.println(ps1.equals(ps2));
        System.out.println(ps1.equals(ps3));

    }
}