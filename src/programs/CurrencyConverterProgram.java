package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class CurrencyConverterProgram {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double price = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    double value = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convertAmount(value, price));

    sc.close();
  }
}
