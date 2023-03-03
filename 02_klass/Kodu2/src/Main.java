import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        KoduApteek ravim1 = new KoduApteek("ravim", 5, 2, LocalDate.parse("2023-09-12"));
        KoduApteek ravim2 = new KoduApteek("ravim", 5, 2, LocalDate.parse("2022-09-12"));
        KoduApteek ravim3 = new KoduApteek("ravim", 3, 2, LocalDate.parse("2024-09-12"));
        KoduApteek ravim4 = new KoduApteek("ravim", 5, 2, LocalDate.parse("2023-03-03"));

        ravim1.kasOnAegunud();
        System.out.println();
        ravim2.kasOnAegunud();
        System.out.println();

        ravim3.ravimVoetud();
        System.out.println();

        String otsas = ravim4.kasOnOtsas();
        System.out.println(otsas);


    }
}