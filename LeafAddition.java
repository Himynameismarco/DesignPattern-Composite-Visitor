public class LeafAddition implements BaseComponentTerm {

  private float firstArg;
  private float secondArg;

  public LeafAddition(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }


  @Override
  public float compute() {
    return firstArg + secondArg;
  }

  @Override
  public String toString() {
    return firstArg + " + " + secondArg;
  }
}
