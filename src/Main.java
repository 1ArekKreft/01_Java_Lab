import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        System.out.println("Podaj swoje imię");
        Scanner scan = new Scanner(System.in);
        String imie = scan.next();
        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scan.next();
        System.out.println("Podaj swój wiek");
        int wiek = scan.nextInt();
        System.out.println("Podaj swój nr indeksu");
        int nr = scan.nextInt();

        System.out.println();
        System.out.printf("Twoje imie: %s",imie);

        System.out.println();
        System.out.printf("Twoje nazwisko: %s",nazwisko);

        System.out.println();
        System.out.println("Twoj wiek: "+wiek);

        System.out.println("Twoj nr indeksu: "+nr);



        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int liczba1 = 53;
        int liczba2=22;

        System.out.println();
        System.out.println("Wynik dodawania: "+ (liczba1+liczba2));
        System.out.println("Wynik odejmowania: "+ (liczba1-liczba2));
        System.out.println("Wynik dodawania: "+ (liczba1*liczba2));
        System.out.println("Wynik dodawania: "+ (liczba1/liczba2));
        System.out.println("Wynik dodawania: "+ (liczba1%liczba2));

    }
}
