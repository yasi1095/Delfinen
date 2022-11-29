import java.util.Scanner;

public class formand extends Medlemmer{
    public void indmeldelse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast medlems navn");
        setName(in.nextLine());

        System.out.println("Indtast medlems fødselsdato i formatet ÅÅÅÅ-MM-DD");
        setDateOfBirth(in.nextLine());

        System.out.println("Er " + getName() + " aktiv eller ej. hvis ja så skrev ja. Hvis ikke så skriv nej ");

        String s = in.nextLine();
        if (s.equalsIgnoreCase("ja")){
            setAktiv(true);
        } else {
            setAktiv(false);
        }

        //System.out.println("Indtast medlems aktivitetsform");

    }

}
