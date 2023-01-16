package patterntest;

import patterntest.visitors.Visitor;

public class Division extends Expression {

  private float firstArg;
  private float secondArg;

  public Division(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }

  @Override
  public void accept(Visitor v) {
    v.visitLeafDivision(this);
  }

  @Override
  public String toString() {
    return firstArg + " : " + secondArg;
  }
}
