package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wylacz = false;

        Pair pair = new Pair();

        while (!wylacz) {
            System.out.print("Podaj działanie które chcesz wykonać: (dodawanie/mnozenie/dzielenie/odejmowanie/wyjdz)");
            String dzialanie = scanner.next();
            if (dzialanie.equals("dodawanie")) {
                pair.setLiczba1(numer1(scanner));
                pair.setLiczba2(numer2(scanner));
                System.out.println("Wynik: " + (pair.getLiczba1() + pair.getLiczba2()));
            }
            if (dzialanie.equals("mnozenie")) {
                pair.setLiczba1(numer1(scanner));
                pair.setLiczba2(numer2(scanner));
                System.out.println("Wynik: " + (pair.getLiczba1() * pair.getLiczba2()));
            }
            if (dzialanie.equals("dzielenie")) {
                pair.setLiczba1(numer1(scanner));
                pair.setLiczba2(numer2(scanner));
                System.out.println("Wynik: " + (pair.getLiczba1() / pair.getLiczba2()));
            }
            if (dzialanie.equals("odejmowanie")) {
                pair.setLiczba1(numer1(scanner));
                pair.setLiczba2(numer2(scanner));
                System.out.println("Wynik: " + (pair.getLiczba1() - pair.getLiczba2()));
            }
            if (dzialanie.equals("wyjdz")) {
                wylacz = true;
            }
        }
    }

    private static double numer1(Scanner scanner) {
        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        return liczba1;
    }

    private static double numer2(Scanner scanner) {
        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();
        return liczba2;
    }

}
