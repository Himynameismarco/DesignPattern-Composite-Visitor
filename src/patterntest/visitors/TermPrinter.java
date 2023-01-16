package patterntest.visitors;

import patterntest.BinaryExpression;
import patterntest.Expression;
import patterntest.Addition;
import patterntest.Division;
import patterntest.Multiplication;
import patterntest.Subtraction;
import patterntest.Literal;

/**
 * This Printer as a visitor has to implement all printing methods individually for each
 * class now ... they say this is useful so that we have alle these methods in one class
 * the visitor.
 */
public class TermPrinter implements Visitor {


  @Override
  public void visitBinaryExpression(BinaryExpression cbe) {
    System.out.println("Hey!");
    for (Expression t : cbe.getExpressions()) {
      System.out.print(t);
      System.out.print(" , ");
    }
  }

  @Override
  public void visitExpression(Expression l) {
    System.out.print(l);
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
