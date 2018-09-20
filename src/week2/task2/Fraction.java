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

    public static int rutGon(int x , int y){
        return (y == 0)?x:(rutGon(y,x%y));
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

    public static void main(String[] args) {

        Fraction ps1 = new Fraction(2,3);
        Fraction ps2 =new Fraction(4,6);
        if(ps1.denominator != 0 && ps2.denominator!=0) {
            //ham cong
            Fraction tong = ps1.add(ps2);
            int tem = rutGon(tong.numerator, tong.denominator);
            Fraction.In(tong.numerator / tem, tong.denominator / tem);

            //ham tru
            Fraction sub = ps1.subtract(ps2);
            int tem1 = rutGon(sub.numerator,sub.denominator);
            Fraction.In(sub.numerator/tem1,sub.denominator/tem1);

            //ham Nhan
            Fraction mul = ps1.multiply(ps2);
            int tem3 = rutGon(mul.numerator,mul.denominator);
            Fraction.In(mul.numerator/tem3,mul.denominator/tem3);

            //ham Chia
            Fraction div = ps1.divide(ps2);
            int tem4 = rutGon(div.numerator,div.denominator);
            Fraction.In(div.numerator/tem4,div.denominator/tem4);
        }
        //ham so sanh
        Fraction s1 = new Fraction(2,4);
        Fraction s2 = new Fraction(1,2);
        Fraction s3 = new Fraction(3,5);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
