package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      boolean wylacz = false;
        while(!wylacz) {
            System.out.print("Podaj działanie które chcesz wykonać: (dodawanie/mnozenie/dzielenie/odejmowanie/wyjdz)");
            String dzialanie = scanner.next();
            if (dzialanie.equals("dodawanie")) {
                double liczba1 = numer1(scanner);
                double liczba2 = numer2(scanner);
                System.out.println("Wynik: " + (liczba1 + liczba2));
            }
            if (dzialanie.equals("mnozenie")) {
                double liczba1 = numer1(scanner);
                double liczba2 = numer2(scanner);
                System.out.println("Wynik: " + (liczba1 * liczba2));
            }
            if(dzialanie.equals("dzielenie")) {
                double liczba1 = numer1(scanner);
                double liczba2 = numer2(scanner);
                System.out.println("Wynik: " + (liczba1 / liczba2));
            }
            if(dzialanie.equals("odejmowanie")) {
                double liczba1 = numer1(scanner);
                double liczba2 = numer2(scanner);
                System.out.println("Wynik: " + (liczba1 - liczba2));
            }
            if(dzialanie.equals("wyjdz")) {
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
