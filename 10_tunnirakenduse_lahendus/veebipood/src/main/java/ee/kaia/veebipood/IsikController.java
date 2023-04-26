package ee.kaia.veebipood;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1,"Coca","Koola", new Date()),
            new Isik(2,"Fanta", "Fanta", new Date()),
            new Isik(3,"Sprite", "Sprite", new Date()),
            new Isik(4,"Vichy", "Vichy", new Date()),
            new Isik(5,"Vitamin well", "Vitamin well", new Date())
    ));
    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikud;
    }

    //DELETE localhost:8080/kustuta-toode/1
    @GetMapping("kustuta-isik/{index}")
    public String kustutaIsik(@PathVariable int index) {
        isikud.remove(index);
        return "Isik kustutatud!";
    }

    //POST localhost:8080/lisa-toode?id=1&nimi=Coca&hind=1.1
    @GetMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        return isikud;
    }
    //localhost:8080/lisa-toode?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true

}

