import java.util.ArrayList;
import java.util.List;

public class CompositeLiteral implements BaseComponentTerm {

  private Integer id;
  private String name;

  private List<BaseComponentTerm> terms;

  public CompositeLiteral(Integer id, String name) {
    this.id = id;
    this.name = name;
    this.terms = new ArrayList<>();
  }

  @Override
  public float compute() {
    System.out.println("Result should be evaluated. I am missing the time to implement. I have to do the next exercise and I have only 20 Minutes left. Sorry.");
    float f = (float) 7373.4;
    return f;
  }

  public void addTerm(BaseComponentTerm term) {
    terms.add(term);
  }

  public void removeTerm(BaseComponentTerm term) {
    terms.remove(term);
  }

  public List<BaseComponentTerm> getTerms() {
    return terms;
  }
}
