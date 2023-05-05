package ee.kaia.spring_kodutoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RavimListController {
    List<Ravim> ravimid = new ArrayList<>(Arrays.asList(
            new Ravim(1, "Paracetamol", 37, "4.06.2024", false),
            new Ravim(2,"Ibumetin", 17, "4.06.2022", true),
            new Ravim(3, "Kurgupastill", 5, "15.01.2025", false),
            new Ravim(4,"ACC", 3, "24.08.2023", false)
    ));
    @GetMapping("ravimid")
    public List<Ravim> saaRavimid() {
        return ravimid;
    }
    @GetMapping("lisa-ravim/{id}{nimetus}/{kogus}/{aegub}/{aegunud}")
    public List<Ravim> lisaRavim(
            @PathVariable int id,
            @PathVariable String nimetus,
            @PathVariable int kogus,
            @PathVariable String aegub,
            @PathVariable boolean aegunud) {
        ravimid.add(new Ravim(id, nimetus, kogus, aegub, aegunud));
        return ravimid;
    }
    @GetMapping("kustuta-ravim/{index}")
    public String kustutaRavim(@PathVariable int index) {
        ravimid.remove(index);
        return "Ravim kustutatud!";
    }
}
