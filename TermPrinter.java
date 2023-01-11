public class TermPrinter implements Visitor {


  @Override
  public void accept(CompositeLiteral compositeLiteral) {
    compositeLiteral.getTerms().forEach(System.out::println);
  }

}
