package week7.task1;

public class Numeral extends Expression {
    private int value;

    public Numeral(){

    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String val = Integer.toString(value);
        return val;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
