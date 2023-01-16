package patterntest;

import patterntest.visitors.Visitor;

public class Subtraction extends Expression {

  private float firstArg;
  private float secondArg;

  public Subtraction(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }

  @Override
  public void accept(Visitor v) {
    v.visitLeafSubtraction(this);
  }

  @Override
  public String toString() {
    return firstArg + " - " + secondArg;
  }
}
