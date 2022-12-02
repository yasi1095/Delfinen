import java.io.IOException;
import java.util.Scanner;

public class LogIn {


    public void login() throws InterruptedException, IOException {


        String s = "";
        String p = "";
        Scanner in = new Scanner(System.in);
        int counter = 0;

        while (true) {

            System.out.println("Indtast din brugernavn:");

            s = in.nextLine();

            System.out.println("Indtast din kode");
            p = in.nextLine();

            if (s.equalsIgnoreCase("Træner") && p.equalsIgnoreCase("træner123")) {
                System.out.println("succes");
                System.out.println("du er nu logget ind som træner");
                break;
            }

            if (s.equalsIgnoreCase("kasser") && p.equalsIgnoreCase("kasser123")) {
                System.out.println("Succes");
                System.out.println("du er nu logget ind som kasser");
                break;

            }
            if (s.equalsIgnoreCase("formand") && p.equalsIgnoreCase("formand123")) {
                System.out.println("Succes");
                System.out.println("du er nu logget ind som formand");
                formand f1 = new formand();
                f1.indmeldelse();
                break;
            } else {
                System.out.println("Forkert brugernavn eller kode prøv igen");
                counter++;
                if (counter >= 3) {
                    System.out.println("Vent venligst 30 sek!!");
                    for (int i = 30; i >= 0; i--) {
                        System.out.print("\r" + i);
                        Thread.sleep(1000);
                    }
                }

            }
        }
    }
}

