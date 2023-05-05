package ee.kaia.spring_kodutoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RavimController {
    Ravim ravim = new Ravim(1, "Paracetamol", 37, "4.06.2024", false);

    @GetMapping("ravim")
    public Ravim saaRavim() {
        return ravim;
    }
    @GetMapping("vahenda-kogust")
    public Ravim vahendaKogust() {
        ravim.setKogus( ravim.getKogus()-1);
        return ravim;
    }
    @GetMapping("muuda-aegunuks")
    public Ravim muudaAegunuks() {
        ravim.setAegunud(!ravim.isAegunud());
        return ravim;
    }
}
