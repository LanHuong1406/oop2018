package week7.task1;

public class Division extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left().evaluate() + "/" + right().evaluate();
    }

    @Override
    public int evaluate() {
        return this.left().evaluate()/this.right().evaluate();
    }
}
