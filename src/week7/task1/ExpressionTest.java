package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {

        try {
            int a = 1/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hihihihihi");
        }

//        Square sq = new Square(new Numeral(10));
//        Subtraction sub = new Subtraction(sq, new Numeral(1));
//        Multiplication mul = new Multiplication(new Numeral(2), new Numeral(3));
//        Addition add = new Addition(sub,mul);
//        Square squ = new Square(add);
//        System.out.println(squ.evaluate());
//
//        try {
//            Division div = new Division(new Numeral(1), new Numeral(0));
//            System.out.println(div.evaluate());
//        }catch (ArithmeticException e){
//            System.err.println("Loi ArithmeticException...ko the chia cho 0...");
//        }

    }
}
