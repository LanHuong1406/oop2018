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
        int T = this.numerator*other.denominator + other.numerator*this.denominator;
        int M = this.denominator*other.denominator;
        Fraction sum = new Fraction(T,M);
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator*other.denominator - other.numerator*this.denominator;
        int M = this.denominator*other.denominator;
        Fraction hieu = new Fraction(T,M);
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator*other.numerator;
        int M = this.denominator*other.denominator;
        Fraction tich = new Fraction(T,M);
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int T = this.numerator*other.denominator;
        int M =this.denominator*other.numerator;
        Fraction chia = new Fraction(T,M);
        return chia;
    }
    
    public static void In(int x, int y){
        if(x == 0)
            System.out.println(0);
        else if(y == 1)
            System.out.println(x);
        else System.out.println(x + "/" + y);
    }

    public boolean equals(Fraction ps){
        if(this.denominator != 0 && ps.denominator != 0){
            if(this.numerator*ps.denominator - this.denominator*ps.numerator == 0)
                return true;
        }
        return false;
    }

}
