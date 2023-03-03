import java.util.Date;

public class Kasutaja {
    String kasutajanimi;
    String parool;
    String email;
    String perenimi;
    String eesnimi;
    boolean aktiivne;
    Date loomisaeg;
    Date kustutamiseaeg;

    public Kasutaja(String kasutajanimi, String parool, String email, String eesnimi, String perenimi) {
        this.kasutajanimi = kasutajanimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aktiivne = true;
        this.loomisaeg = new Date();
        this.kustutamiseaeg = null;
    }

    public String kustutaKasutaja() {
        this.kustutamiseaeg = new Date();
        this.aktiivne = false;
        return "Kasutaja  kustutatud!";
    }

    public void muudaParooli(String uusParool) {
        this.parool = uusParool;
        System.out.println("Parool muudetud!");
    }
}
