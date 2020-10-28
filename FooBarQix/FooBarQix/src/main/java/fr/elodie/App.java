package fr.elodie;

/**
 * Hello world!
 */
public final class App {

  private App() {}

  public static String fooBarQix(int chiffreTeste) {
    String resultat = "";
    if (chiffreTeste % 3 == 0) {
      resultat += "Foo";
    }
    if (chiffreTeste % 5 == 0) {
      resultat += "Bar";
    }
    if (chiffreTeste % 7 == 0) {
      resultat += "Qix";
    }

    int number = chiffreTeste;
    int puissance = (int) Math.pow(
      10,
      String.valueOf(chiffreTeste).length() - 1
    );

    if (chiffreTeste > 10) {
      number = chiffreTeste / puissance % 10;
    }

    while (puissance > 0) {
      if (number == 5) {
        resultat += "Bar";
      } else if (number == 7) {
        resultat += "Qix";
      } else if (number == 3) {
        resultat += "Foo";
      } else if (number == 0) {
        resultat += "*";
      }
      if (chiffreTeste > 10 && puissance >= 10) {
        puissance /= 10;
        number = chiffreTeste / puissance % 10;
      } else {
        break;
      }
    }

    if (resultat == "") {
      return Integer.toString(chiffreTeste);
    } else {
      return resultat;
    }
  }
}
