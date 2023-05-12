package ee.kaia.veebipood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeController {

    @Autowired
    ToodeRepository toodeRepository;

    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"Koola", 1.5),
            new Toode(2,"Fanta", 1.0),
            new Toode(3,"Sprite", 1.7),
            new Toode(4,"Vichy", 2.0),
            new Toode(5,"Vitamin well", 2.5)
    ));
    @GetMapping("tooted")
    public List<Toode> saaTooted() {
        return toodeRepository.findAll();
    }

    //DELETE localhost:8080/kustuta-toode/1
    @DeleteMapping("kustuta-toode/{id}")
    public String kustutaToode(
            @PathVariable int id) {
        //tooted.remove(index);
        toodeRepository.deleteById(id);
        return "Toode kustutatud!";
    }

    //POST localhost:8080/lisa-toode?id=1&nimi=Coca&hind=1.1
    @PostMapping("lisa-toode")
    public List<Toode> lisaToode(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind) {
        //tooted.add(new Toode(id, nimi, hind));
        //return tooted;
        toodeRepository.save(new Toode(id, nimi, hind));
        return toodeRepository.findAll();
    }
    //localhost:8080/lisa-toode?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true
}

