import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Isik isik1 = new Isik("60208230266", "Sandra", "Sander");
        Isik isik2 = new Isik("60209250266", "Kalle", "Kallus");
        Ravim ravim1 = new Ravim("ravim", 5, 2, LocalDate.parse("2023-09-12"), isik1);
        Ravim ravim2 = new Ravim("ravim", 5, 2, LocalDate.parse("2022-09-12"), isik2);
        Ravim ravim3 = new Ravim("ravim", 3, 2, LocalDate.parse("2024-09-12"), isik2);
        Ravim ravim4 = new Ravim("ravim", 5, 2, LocalDate.parse("2023-03-03"), isik1);

        ravim1.kasOnAegunud();
        //ravim2.kasOnAegunud();

        ravim3.ravimVoetud();

        String otsas = ravim4.kasOnOtsas();
        System.out.println(otsas);

        String omanik = ravim2.kelleOma();
        System.out.println(omanik);


    }
}