package fr.elodie;

/**
 * Hello world!
 */
public final class App {

  public static boolean leapYearTest(int anneeTestee) {
    if (anneeTestee % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
