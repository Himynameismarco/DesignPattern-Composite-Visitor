public class TermEvaluator implements Visitor {


  @Override
  public void accept(CompositeLiteral compositeLiteral) {
    System.out.println(compositeLiteral.compute());
  }
}
