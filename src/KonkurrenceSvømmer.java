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

           e= Svømmehold.SENIOR;
        }
        else {
            e=Svømmehold.JUNIOR;
        }
        return  e;
    }

    public String returnerSvømmestil(){


        String q = "";

        boolean s = false;
        if (kanButterfly == true){
            s = true;
            q = "kanButterfly ";

        }  if (kanBryst == true) {
            s =true;
            q = "kanBryst ";
        }
        if (kanCrawl == true) {
            s = true;
            q = "kanCrawl ";


        }
        if (kanRygCrawl == true) {
            s= true;

            q = "kanRygCrawl ";

        }

return q+s ;
    }


    @Override
    public String toString() {
        return
                returnerSvømmestil() + " name: " +getName() + "  age: " +
                getAgeInYears() + " hold: " + hold()
                ;
    }
}
