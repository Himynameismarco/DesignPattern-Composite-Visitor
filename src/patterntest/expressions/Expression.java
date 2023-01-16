package patterntest.expressions;

import patterntest.visitors.Visitor;

public abstract class Expression {

  public abstract void accept(Visitor v);
}
