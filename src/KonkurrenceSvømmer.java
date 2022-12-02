import java.util.Random;
import java.util.Scanner;

public class KonkurrenceSvømmer extends Medlemmer {


    private boolean kanCrawl;
    private boolean kanBryst;
    private boolean kanRygCrawl;
    private boolean kanButterfly;
    private boolean konkurrencesvømmer;

    public KonkurrenceSvømmer() {

    }

    public KonkurrenceSvømmer(boolean aktiv, boolean restance, boolean konkurrencesvømmer, String dateOfBirth,
                              String name, boolean kanCrawl, boolean kanBryst, boolean kanRygCrawl, boolean kanButterfly) {

        super(dateOfBirth, name, aktiv, restance);
        this.konkurrencesvømmer = konkurrencesvømmer;
        this.kanBryst = kanBryst;
        this.kanButterfly = kanButterfly;
        this.kanCrawl = kanCrawl;
        this.kanRygCrawl = kanRygCrawl;

        setAktiv(true);

    }

    public void setKanCrawl(boolean kanCrawl) {
        this.kanCrawl = kanCrawl;
    }

    public boolean isKanCrawl() {
        return kanCrawl;
    }

    public void setKanBryst(boolean kanBryst) {
        this.kanBryst = kanBryst;
    }

    public boolean isKanBryst() {
        return kanBryst;
    }

    public void setKanRygCrawl(boolean kanRygCrawl) {
        this.kanRygCrawl = kanRygCrawl;
    }

    public boolean isKanRygCrawl() {
        return kanRygCrawl;
    }

    public void setKanButterfly(boolean kanButterfly) {
        this.kanButterfly = kanButterfly;
    }

    public boolean isKanButterfly() {
        return kanButterfly;
    }

    public void KonkurrencesvømmerIndmelser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast medlems navn");
        setName(in.nextLine());

        System.out.println("Indtast medlems fødselsdato i formatet ÅÅÅÅ-MM-DD");
        setDateOfBirth(in.nextLine());

        System.out.println("Indtast konkurrencesvømmerens disciplin. Indtast c for crawl, b for bryst," +
                " bf for butterfly, rg for rygcrawl");

        String s = in.nextLine();

        while (true) {
            if (s.equalsIgnoreCase("c")) {
                setKanCrawl(true);
            } else if (s.equalsIgnoreCase("b")) {
                setKanBryst(true);
            } else if (s.equalsIgnoreCase("bf")) {
                setKanButterfly(true);
            } else if (s.equalsIgnoreCase("rg")) {
                setKanRygCrawl(true);
            }
            System.out.println("vil du tilføje mere. Tast ja, hvis du vil tilføje mere, ellers tast nej");
            String q = in.nextLine();
            if (q.equalsIgnoreCase("ja")) {
                System.out.println("Indtast konkurrencesvømmerens disciplin. Indtast c for crawl, b for bryst," +
                        " bf for butterfly, rg for rygcrawl");
                s = in.nextLine();
            } else if (q.equalsIgnoreCase("nej")) {
                break;
            }


        }


    }

    public Enum hold() {

        Enum e;

        if (getAgeInYears() >= 18) {

            e = Svømmehold.SENIOR;
        } else {
            e = Svømmehold.JUNIOR;
        }
        return e;
    }

    public String returnerSvømmestil() {
        String b = "";
        String kb = "";
        String kc = "";
        String krc = "";

        if (kanBryst == true) {
            b = " Bedste tid for Bryst er " +bedsteTider() + " sekunder\n";
        }
        if (kanButterfly == true) {
            kb =  " Bedste tid for Butterfly er " +bedsteTider() + " sekunder\n";
        }
        if (kanCrawl == true) {
            kc = " Bedste tid for Crawl er " +bedsteTider() + " sekunder\n";
        }
        if (kanRygCrawl == true) {
            krc =  " Bedste tid for Ryg Crawl er " +bedsteTider() + " sekunder\n";

        }
        String samlet = b + kb + kc + krc;

        return samlet.substring(1, samlet.length() - 1) ;
    }
    public String holdForTrænere(){

        Svømmehold s;
        Træner træner = new Træner();
        træner.setName("Hardy Akira Madsen");
        Træner træner1 = new Træner();
        træner1.setName("Patrick Agergaard");

        String holder = "";

        if (getAgeInYears() >= 18) {

            holder= træner.getName();

            s = Svømmehold.SENIOR;
        } else {

            holder= træner1.getName();
            s = Svømmehold.JUNIOR;
        }
        return holder;

    }

    public double bedsteTider(){
        Random random = new Random();

        double resultat = random.nextInt(1000)+2000;

        double sumResultat = resultat/100;


        return sumResultat;
    }



    @Override
    public String toString() {
        return
                 "Navn: " + getName() + "\n" + getName() + " er tilmeldt følgende svømmestile:\n" + returnerSvømmestil() + ":\n Alder: " +
                        getAgeInYears() + " hold: " + hold() + " Træner: "+ holdForTrænere() ;
    }
}
