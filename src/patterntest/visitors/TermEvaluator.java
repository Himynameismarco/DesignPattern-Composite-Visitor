package patterntest.visitors;

import patterntest.BinaryExpression;
import patterntest.Addition;
import patterntest.Division;
import patterntest.Multiplication;
import patterntest.Subtraction;
import patterntest.Literal;
import patterntest.Expression;


/**
 * This Evaluator as a visitor has to implement all evaluating methods individually for each
 * class now ... they say this is useful so that we have alle these methods in one class
 * the visitor.
 */
public class TermEvaluator implements Visitor {



  @Override
  public void visitExpression(Expression l) {
    System.out.print(l);
  };

  @Override
  public void visitBinaryExpression(BinaryExpression cbe) {
    System.out.print(cbe);
  }

  @Override
  public void visitLeafAddition(Addition l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafDivision(Division l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafMultiplication(Multiplication l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafSubtraction(Subtraction l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafLiteral(Literal l) {
    System.out.print(l);
  }
}
