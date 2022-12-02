import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class formand extends Medlemmer {
    public void indmeldelse() throws IOException {

        while (true) {
            Scanner in = new Scanner(System.in);
            ArrayList<KonkurrenceSvømmer> MedlemslistenforKonkurrencesvømmere = new ArrayList<>();
            ArrayList<Medlemmer> MedlemslistenforAlmindelige = new ArrayList<>();

            System.out.println("Vil du tilføje et almindeligt medlem eller en konkurrencesvømmer?\n" +
                    "Tast a for almindeliig \nTast k for konkurrencesvømmer. \n" +
                    "Tast s hvis du vil afslutte handlingen " );
            String input = in.nextLine();
            if (input.equalsIgnoreCase("k")) {
                KonkurrenceSvømmer ks1 = new KonkurrenceSvømmer();
                ks1.KonkurrencesvømmerIndmelser();
                MedlemslistenforKonkurrencesvømmere.add(ks1);
                System.out.println(ks1);
            } else if (input.equalsIgnoreCase("a")) {
                Medlemmer m1 = new Medlemmer();
                m1.createMember();
                MedlemslistenforAlmindelige.add(m1);
                System.out.println(m1);
            } else if (input.equalsIgnoreCase("s")) {
                break;
            }

            PrintWriter w = new PrintWriter(new FileWriter(new File("f.txt"),true));

            if (MedlemslistenforAlmindelige.isEmpty()) {
                w.println(MedlemslistenforKonkurrencesvømmere);
                MedlemslistenforKonkurrencesvømmere.clear();
            } else
                w.println(MedlemslistenforAlmindelige);
                MedlemslistenforAlmindelige.clear();


            w.flush();
            w.close();
        }

    }
}
// leg
    /* public static void main(String[] args) throws FileNotFoundException {
        formand f = new formand();
        f.indmeldelse();
        System.out.println(f);

        Scanner read = new Scanner(new File("f.txt"));
        int counter = 0;

        while (read.hasNext()){
            System.out.println(read.next());
            counter++;

        }
        System.out.println(counter);

     */

