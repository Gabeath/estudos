package entities;

public class CurrencyConverter {
  public static final double IOF = 0.06;

  public static double convertAmount(double value, double price) {
    return value * price * (1 + IOF);
  }
}
