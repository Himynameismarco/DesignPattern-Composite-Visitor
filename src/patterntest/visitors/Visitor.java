package patterntest.visitors;

import patterntest.BinaryExpression;
import patterntest.Expression;
import patterntest.Addition;
import patterntest.Division;
import patterntest.Multiplication;
import patterntest.Subtraction;
import patterntest.Literal;

public interface Visitor {

  public void visitExpression(Expression e);

  public void visitBinaryExpression(BinaryExpression cbe);

  public void visitLeafAddition(Addition l);

  public void visitLeafDivision(Division l);

  public void visitLeafMultiplication(Multiplication l);

  public void visitLeafSubtraction(Subtraction l);

  public void visitLeafLiteral(Literal l);

}
