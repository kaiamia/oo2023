import java.time.LocalDate;
public class Ravim {
    String ravimiNimetus;
    int alles;
    int paevaneKogus;
    LocalDate aegumisKuupaev;
    boolean aegunud;
    boolean otsas;
    Isik isik;

    public Ravim(String ravimiNimetus, int alles, int paevaneKogus, LocalDate aegumisKuupaev, Isik isik) {
        this.ravimiNimetus = ravimiNimetus;
        this.alles = alles;
        this.paevaneKogus = paevaneKogus;
        this.aegumisKuupaev = aegumisKuupaev;
        this.aegunud = false;
        this.otsas = false;
        this.isik = isik;
    }
    public void ravimVoetud(){
        this.alles = this.alles - this.paevaneKogus;
        System.out.println("Ravimit alles:"+this.alles);
        if (this.alles == 0 || this.alles < this.paevaneKogus) {
            saiOtsa();
        }
    }

    public void kasOnAegunud(){
        LocalDate tananeKuupaev = LocalDate.now();
        int tulemus = this.aegumisKuupaev.compareTo(tananeKuupaev);
        if ( tulemus < 0 || tulemus == 0) {
            this.aegunud = true;
            System.out.println("See ravim on aegunud!");
        } else {
            System.out.println("See ravim aegub:"+this.aegumisKuupaev);
        }
    }
    public void saiOtsa(){
        this.otsas = true;
        System.out.println("See ravim sai otsa!");
    }
    public String kasOnOtsas(){
        if(this.otsas){
            return "See ravim on otsas!";
        } else {
            return "Seda ravimit on jätkub veel:"+this.alles/this.paevaneKogus+" päeva";
        }
    }
    public String kelleOma(){
        return "Ravimit " + ravimiNimetus + " võtab: " + isik.eesnimi + " " + isik.perenimi;
    }
}
