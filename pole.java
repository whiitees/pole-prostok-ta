import java.util.Scanner;

public class PoleProstokata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość boku prostokąta: ");
        double dlugosc = scanner.nextDouble();

        System.out.print("Podaj szerokość boku prostokąta: ");
        double szerokosc = scanner.nextDouble();

        double pole = obliczPoleProstokata(dlugosc, szerokosc);
        System.out.println("Pole prostokąta o bokach " + dlugosc + " i " + szerokosc + " wynosi: " + pole);
    }

    public static double obliczPoleProstokata(double dlugosc, double szerokosc) {
        return dlugosc * szerokosc;
    }
}
