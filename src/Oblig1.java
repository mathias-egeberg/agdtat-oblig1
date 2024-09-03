import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static void main(String[] args) {

        int[] a = {10,9,8,7,6,5,4,3,2,1};

        System.out.println(maks(a));
        System.out.println(ombyttninger(a));


    }

    //Oppgave 0
    public static int gruppeMedlemmer(){
        return 2;
    }


    //Oppgave 1
    public static int maks(int[] a){
        if(a.length == 0){
            throw new NoSuchElementException("Ingen elementer i ditt array");
        }
        for (int i = 1; i < a.length; i++){
            if (a[i-1]>a[i]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        return a[a.length-1];
    }

    public static int ombyttninger (int[] a){
        if(a.length == 0){
            throw new NoSuchElementException("Array er tomt - ingen ombyttninger");
        }

        int antall = 0;
        for (int i = 1; i < a.length; i++){
            if (a[i-1]>a[i]){
                int temp = a[i]; a[i] = a[i-1]; a[i-1] = temp;
                antall++;
            }
        }
        return antall;
    }

}
