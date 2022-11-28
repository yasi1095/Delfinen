import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;
public class brugeroplysninger {

    static Scanner in = new Scanner(System.in);
        String giveAName;
        String surname;
        String aktivitetsform;
        String displayName;

        long age;


        public brugeroplysninger(String giveAName, String surname, String aktivitetsform, LocalDate localDate) {
            this.giveAName = giveAName;
            this.surname = surname;
            this.aktivitetsform = aktivitetsform;


        }

        public brugeroplysninger(){

        }

        public String getDisplayName() {
            return giveAName + ", " + surname + ", " + aktivitetsform;
        }
        public static int GetAge(){

            System.out.println("Indtast fødselsdato i formatete ÅÅÅÅ-MM-DD");
            LocalDate birthYear = LocalDate.parse(in.nextLine());

            long ageDifference = ChronoUnit.YEARS.between(birthYear, LocalDate.now());

            System.out.println(ageDifference);
            return (int) ageDifference;
        }



    }



