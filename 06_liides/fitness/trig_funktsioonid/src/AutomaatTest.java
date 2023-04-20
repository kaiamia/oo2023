import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AutomaatTest {
    @Test
    public void kontrolli_siinuse_kaatetite_suhet(){
        Siinus sin = new Siinus(3,4,5);
        assertEquals(0.6, sin.leiaKaatetiteSuhe(), 0.0);
    }
    @Test
    public void kontrolli_siinuse_nurka(){
        Siinus sin = new Siinus(3,4,5);
        assertEquals(36.87, sin.leiaNurk(), 0.0);
    }
    @Test
    public void kontrolli_koosinuse_kaatetite_suhet(){
        Koosinus cos = new Koosinus(3, 9, 12);
        assertEquals(0.75, cos.leiaKaatetiteSuhe(), 0.0);
    }
    @Test
    public void kontrolli_koosinuse_nurk(){
        Koosinus cos = new Koosinus(3, 9, 12);
        assertEquals(41.41, cos.leiaNurk(), 0.0);
    }
    @Test
    public void kontrolli_tangensi_kaatetite_suhet(){
        Tangens tan = new Tangens(7,4,9);
        assertEquals(1.75, tan.leiaKaatetiteSuhe(), 0.0);
    }
    @Test
    public void kontrolli_tangensi_nurka(){
        Tangens tan = new Tangens(7,4,9);
        assertEquals(60.26, tan.leiaNurk(), 0.0);
    }
}
