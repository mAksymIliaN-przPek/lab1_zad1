
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = "Maksymilian";
        int age = 19;
        System.out.println("Mam na imię " + name + " i mam " + age + " lat.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int num2 = scanner.nextInt();
        calculateNumbers(num1, num2);
        System.out.println("Podaj liczbę, zobaczymy czy parzysta :)");
        int num3 = scanner.nextInt();
        boolean czyparzysta = czyliczbaparzysta(num3);
        if (czyparzysta){
            System.out.println(num3 + " jest parzysta.");
        } else {
            System.out.println(num3 + " nie jest parzysta.");
        }
        System.out.println("teraz zobaczmy czy liczba podzielna przez 3 i 5");
        int num4 = scanner.nextInt();
        boolean czypodzielne = czypodzielne(num4);
        if (czypodzielne) {
            System.out.println(num4 + " jest podzielna przez 3 i 5.");
        } else {
            System.out.println(num4 + " nie jest podzielna przez 3 i 5.");
        }
        int num5 = scanner.nextInt();
        int wynik = doszescianu(num5);
        System.out.println(num5 + " podniesione do 3 potęgi to " + wynik);

        double num6 = scanner.nextInt();
        double wynik2 = squareRoot(num6);
        System.out.println("Pierwiastek kwadratowy z " + num6 + " to " + wynik2);

        System.out.println("podaj 3 boki, program sprawdzi czy można utowrzyć z nich trójkąt prostokątny");
        double bok1 =scanner.nextDouble();
        double bok2 = scanner.nextDouble();
        double bok3 = scanner.nextDouble();
        boolean wynik3 = czyMoznaZbudowacTrojkatProstokatny(bok1, bok2, bok3);
        System.out.println(wynik3);
    }

    public static void calculateNumbers(int a, int b) {
        int dodawanie = a + b;
        int odejmowanie = a - b;
        int mnozenie = a * b;
        System.out.println("Suma: " + dodawanie);
        System.out.println("Różnica: " + odejmowanie);
        System.out.println("Iloczyn: " + mnozenie);
    }

    public static boolean czyliczbaparzysta(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean czypodzielne(int number) {
        return (number % 3 == 0 && number % 5 == 0); //return 1 tylko jak 2 bramki true
    }

    public static int doszescianu(int number) {
        return number * number * number;
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static boolean czyMoznaZbudowacTrojkatProstokatny(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {

            return false;
        }
        double odcinki[] = {a, b, c};
        Arrays.sort(odcinki);
        if (odcinki[0] + odcinki[1] > odcinki[2]) {
            return Math.pow(odcinki[0], 2) + Math.pow(odcinki[1], 2) == Math.pow(odcinki[2], 2);
        }

        return false;
    }

}