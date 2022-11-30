import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().run();
        }
    public void run() throws IOException {

        formand f1 = new formand();

        f1.indmeldelse();



        //KonkurrenceSvømmer k1 = new KonkurrenceSvømmer();

       // k1.KonkurrencesvømmerIndmelser();
        //System.out.println(k1);
        //formand f1 = new formand();
        //f1.indmeldelse();
        //System.out.println(f1);


        /*KonkurrenceSvømmer k1 = new KonkurrenceSvømmer();
        k1.setKanBryst(true);
        k1. setKanButterfly(true);

        k1.setDateOfBirth("2001-04-02");

        System.out.println(k1 + " " + k1.getAgeInYears());

         */


    }
}

