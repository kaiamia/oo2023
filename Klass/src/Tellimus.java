import java.util.Date;
import java.util.List;

public class Tellimus {
    Date tegemisAeg;
    String tellija;
    List<String> tooted;
    boolean makstud;

    public Tellimus(String tellija, List<String> tooted) {
        this.tegemisAeg = new Date();
        this.makstud = false;
        this.tellija = tellija;
        this.tooted = tooted;
    }

    public void muudaMakstuks() {
        this.makstud = true;
    }
    public String kasOnMakstud() {
        if (makstud) {
            return "Makstud!";
        } else {
            return "Maskmata!";
        }
    }
}
