
////// Løsningsforslag Oblig 1 - 2019 ////////////////////////



import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.NoSuchElementException;


public class Oblig1 {
  

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length < 1) throw new NoSuchElementException("Tabell is empty");

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }
        return a[a.length - 1];

        }




    public static int ombyttinger(int[] a) {
        int antallombytt = 0;
        if (a.length < 1) throw new NoSuchElementException("Tabel is empty");

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                antallombytt++;
            }
        }
        return antallombytt;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int antallUlike = 1;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Array is not sorted in ascending order");
            }
            else if (a[i] != a[i + 1]){
                ++antallUlike;
            }
        }

        return antallUlike;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        int teller = 0;                        // Hjelpevariabel som teller opp antall ulike heltall

        for (int i = 0; i < a.length; i++) {   // Itererer igjennom hele int[] a
            boolean erUlik = false;
            for (int j = 0; j < i; j++) {      // Itererer gjennom a[i] og a[j] samtidig
                if (a[i] == a[j]) {            // Hvis a[i] og a[j] har sammme verdi setter vi
                    erUlik = true;             // den boolske variabelen erUlike på true og hopper ut av
                    break;                     // nåværende iterasjon og fortsetter videre på neste iterasjon
                }
            }

            if (!erUlik) {                     // For hver iterasjon erUlik er satt til false
                teller++;                      // plusser vi med 1 i teller
            }

        }
        return teller;                         // Returnerer verdien til teller som er antall ulike heltall

    }



    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        int v = a[0];
        int h = a.length - 1;

        for (int i = 0; i < a.length; i++) {

            while (a[v] % 2 == 0) {

                v++;

            }
            while (a[h] % 2 != 0) {
                h--;

            }
            if (v < h) {

                int temp = a[v];
                a[v] = a[h];
                a[h] = temp;

            }

        }



    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length <= 1)
            return;

        char k = a[a.length - 1];

        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
        }

        a[0] = k;

    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        if (a.length <= 1)
            return;

        k %= a.length;

        char[] tmp = new char[Math.abs(k)];
        int c = 0;

        // right
        if (k > 0) {
            for (int i = a.length - k; i < a.length; i++)
                tmp[c++] = a[i];

            for (int i = a.length - k - 1; i >= 0; i--) {
                a[k + i] = a[i];
                if (i < k)
                    a[i] = tmp[i];
            }

            // left
        } else if (k < 0) {
            k = Math.abs(k);

            for (int i = 0; i < k; i++)
                tmp[i] = a[i];

            for (int i = 0; i <= a.length - k - 1; i++)
                a[i] = a[k + i];

            for (int i = 0; i < tmp.length; i++)
                a[a.length - i - 1] = tmp[k - i - 1];
        }


    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new NotImplementedException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new NotImplementedException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new NotImplementedException();
    }


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new NotImplementedException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new NotImplementedException();
    }

}  // Oblig1
