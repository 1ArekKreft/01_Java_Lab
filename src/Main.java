import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznychh */

        int liczba = 14;

        //Arytmetyczne

        if(liczba%2==0 && liczba>0)
        {
            System.out.println("Podana liczba jest większa od zera i jest parzysta");
        }
        System.out.println();

        if(liczba>10 && liczba<101)
        {
            System.out.println("Podana liczba mieści się w przedziale od 10 do 100");
        }
        System.out.println();

        if(liczba % 2 == 0 && liczba % 6 ==0)
        {
            System.out.println("Podana liczba jest podzielna przez 2 i 6");
        }
    }
}
