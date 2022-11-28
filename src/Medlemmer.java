public class Medlemmer extends brugeroplysninger {

    private String age = " ";
    private String name;
    private boolean aktiv;
    private boolean restance;
    private boolean konkurrenceSvømmer;
    private final int seniorPris = 1600;
    private final int juniorPris = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public String getAge() {
        return getAge();
    }

    public void setAge(String age) {
        this.age = age;
    }

// pristjek i forhold til medlemmets status og pris heraf
    public void prisTjek() {

        int age = Integer.parseInt(getAge());
        if (age >= 60) {
            price = seniorPris / 100 * 75;
        } else if (age >= 18 && age < 60) {
            price = seniorPris;
        } else if (age < 18) {
            price = juniorPris;
        } else if (aktiv == false) {
            price = 500;
        }
    }

    //Aktivitetsform i forhold til konkurrencesvømmere samt om de skal på senior eller juniorholdet
    public Svømmehold aktivitetsForm(boolean konkurrenceSvømmer){
        Svømmehold s;

        int age = (Integer.parseInt(getAge()));


        if (age >= 18 && konkurrenceSvømmer == true) {
            s = Svømmehold.SENIOR;
return Svømmehold.SENIOR;
        }else  {
                s = Svømmehold.JUNIOR;
                return Svømmehold.JUNIOR;


        }

// 
    }

}
