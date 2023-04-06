package entities;

public class Student {
  public String name;
  public double scoreA;
  public double scoreB;
  public double scoreC;

  public double grade() {
    return scoreA + scoreB + scoreC;
  }

  public String gradeResult() {
    return grade() > 60.0 ? "PASSED" : String.format("FAILED%nMISSING %.2f POINTS", 60.0 - grade());
  }
}
