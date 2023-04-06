package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentProgram {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    System.out.print("Name: ");
    student.name = sc.nextLine();
    System.out.print("Score A: ");
    student.scoreA = sc.nextDouble();
    System.out.print("Score B: ");
    student.scoreB = sc.nextDouble();
    System.out.print("Score C: ");
    student.scoreC = sc.nextDouble();

    System.out.println();
    System.out.printf("FINAL GRADE: %.2f%n", student.grade());
    System.out.println(student.gradeResult());

    sc.close();
  }

}
