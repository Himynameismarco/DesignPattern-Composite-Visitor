package patterntest;

import patterntest.visitors.TermPrinter;
import patterntest.visitors.Visitor;

public class main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    BinaryExpression binaryExpression = new BinaryExpression();
    binaryExpression.addTerm(new Multiplication(5, 5));
    binaryExpression.addTerm(new Addition(2, 4));


    Visitor visitor = new TermPrinter();
    binaryExpression.accept(visitor);
  }
}