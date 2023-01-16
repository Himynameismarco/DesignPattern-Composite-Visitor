package patterntest;

import patterntest.visitors.Visitor;

public class Expression {

  void accept(Visitor v) {
    v.visitExpression(this);
  }


}
