package ee.kaia.spring_kodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class IsikController {
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1, "Rasmus", "Rasmus"),
            new Isik(2,"Teele", "Teele"),
            new Isik(3,"Sandra", "Sandra")
    ));

    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikud;
    }

    @GetMapping("kustuta-isik/{index}")
    public String kustutaIsik(@PathVariable int index) {
        isikud.remove(index);
        return "Isik kustutatud!";
    }

    @GetMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        isikud.add(new Isik(id, eesnimi, perenimi));
        return isikud;
    }
}
