import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KasserUI extends Medlemmer{

    static ArrayList container = new ArrayList<>();

    public static void kasserui() throws FileNotFoundException {
        Scanner læser = new Scanner(new File("almindelig.txt"));
        while (læser.hasNext()){
            container.add(læser.next());

        }
        for (int i = 0; i <container.size() ; i++) {

                System.out.println(container.get(i));
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        kasserui();
    }

}
