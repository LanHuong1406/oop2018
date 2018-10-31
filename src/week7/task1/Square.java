package week7.task1;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
      // String square = Integer.toString(expression.evaluate() + '^'+'2');
       return expression.toString() + "^" + "2";
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
}
