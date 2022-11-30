import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Medlemmer {

    private String dateOfBirth;
    private String name;

    Scanner in = new Scanner(System.in);
    private boolean aktiv;
    private boolean restance;
    private final int seniorPris = 1600;
    private final int juniorPris = 1000;
    private int price = 0;

    public Medlemmer(String dateOfBirth, String name, boolean aktiv, boolean restance) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.aktiv = aktiv;
        this.restance = restance;
    }

    public Medlemmer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public int getAgeInYears() {

        LocalDate birthYear = LocalDate.parse(dateOfBirth);

        long ageDifference = ChronoUnit.YEARS.between(birthYear, LocalDate.now());

        return (int) ageDifference;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPrice() {
        return price;
    }

    // pristjek i forhold til medlemmets status og pris heraf
    public int prisTjek() {
        if (aktiv == true){



        if (getAgeInYears() >= 60) {
            price = seniorPris / 100 * 75;
        } else if (getAgeInYears() >= 18 && getAgeInYears() < 60) {
            price = seniorPris;
        } else if (getAgeInYears() < 18) {
            price = juniorPris;
        }
        } else if (aktiv == false) {
            price = 500;
        }
        return price;
    }
    public void createMember(){
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast medlems navn");
        setName(in.nextLine());

        System.out.println("Indtast medlems fødselsdato i formatet ÅÅÅÅ-MM-DD");
        setDateOfBirth(in.nextLine());

        System.out.println("Er " + getName() + " aktiv eller ej. hvis ja så skrev ja. Hvis ikke så skriv nej ");

        String s = in.nextLine();
        if (s.equalsIgnoreCase("ja")) {
            setAktiv(true);
        } else {
            setAktiv(false);
        }
    }

    //Aktivitetsform i forhold til konkurrencesvømmere samt om de skal på senior eller juniorholdet
    public Svømmehold aktivitetsForm(boolean konkurrenceSvømmer) {
        Svømmehold s;


        if (getAgeInYears() >= 18 && konkurrenceSvømmer == true) {
            s = Svømmehold.SENIOR;
            return Svømmehold.SENIOR;
        } else {
            s = Svømmehold.JUNIOR;
            return Svømmehold.JUNIOR;

        }
//
    }

    @Override
    public String toString() {
        return
                "age='" + getAgeInYears() + '\'' +
                ", name='" + name + '\'' +
                ", aktiv=" + aktiv +
                ", restance=" + restance +
                ", price=" + prisTjek();

    }
}
