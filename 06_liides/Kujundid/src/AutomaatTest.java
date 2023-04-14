import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AutomaatTest {
    //@Test alt+enter Add JUnit4
    @Test
    public void kontrolli_kolmnurga_ymbermoot(){
        Kolmnurk kolmnurk = new Kolmnurk(3, 6, 7, 8);
        assertEquals(21.0, kolmnurk.arvutaYmberMoot(), 0.0);
    }
}
//vähemalt 3 täidetud klassi, 1 interface vähemalt 2 funi, 1 parent class, täidetud, kõigil fun täidetud, kõigil automaattestid (min 6)