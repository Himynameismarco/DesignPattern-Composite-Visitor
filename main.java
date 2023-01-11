

public class main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    CompositeLiteral compositeLiteral = new CompositeLiteral(1, "myComposite");
    compositeLiteral.addTerm(new LeafMultiplication(5, 5));
    compositeLiteral.addTerm(new LeafAddition(2, 4));


    Visitor visitor = new TermPrinter();
    visitor.accept(compositeLiteral);

    Visitor visitor1 = new TermEvaluator();
    visitor1.accept(compositeLiteral);

  }
}