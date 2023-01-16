package patterntest;

import patterntest.visitors.Visitor;

public class Multiplication extends Expression {

  private float firstArg;
  private float secondArg;

  public Multiplication(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }
  @Override
  public void accept(Visitor v) {
    v.visitLeafMultiplication(this);
  }

  @Override
  public String toString() {
    return firstArg + " * " + secondArg;
  }
}
