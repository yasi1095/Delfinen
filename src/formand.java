import java.util.Scanner;

public class formand extends Medlemmer{
    public void indmeldelse(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Indtast medlems navn");
        setName(in.nextLine());

        System.out.printf("Indtast medlems fødselsdato i formatet ÅÅÅÅ-MM-DD");
        setAge(in.nextLine());

        System.out.println("Indtast medlems aktivitetsform");





    }

}
