package patterntest;

import java.util.ArrayList;
import java.util.List;
import patterntest.visitors.Visitor;


public class BinaryExpression extends Expression {


  private List<Expression> terms;

  public BinaryExpression() {
    this.terms = new ArrayList<Expression>(2);
  }

  @Override
  public void accept(Visitor v) {
    v.visitBinaryExpression(this);
  }

  public void addTerm(Expression expression) {
    terms.add(expression);
  }

  public void removeTerm(Expression expression) {
    terms.remove(expression);
  }

  public List<Expression> getExpressions() {
    return terms;
  }
}
