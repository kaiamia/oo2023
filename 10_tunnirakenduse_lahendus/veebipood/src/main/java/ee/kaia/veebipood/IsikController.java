package ee.kaia.veebipood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {
    @Autowired
    IsikRepository isikRepository;
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1,"Coca","Koola", new Date()),
            new Isik(2,"Fanta", "Fanta", new Date()),
            new Isik(3,"Sprite", "Sprite", new Date()),
            new Isik(4,"Vichy", "Vichy", new Date()),
            new Isik(5,"Vitamin well", "Vitamin well", new Date())
    ));
    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikRepository.findAll();
    }

    //DELETE localhost:8080/kustuta-toode/1
    @DeleteMapping("kustuta-isik/{id}")
    public String kustutaIsik(@PathVariable int id) {
        //isikud.remove(index);
        isikRepository.deleteById(id);
        return "Isik kustutatud!";
    }

    //POST localhost:8080/lisa-toode?id=1&nimi=Coca&hind=1.1
    @PostMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        //isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        //return isikud;
        isikRepository.save(new Isik(id, eesnimi, perenimi, new Date()));
        return isikRepository.findAll();
    }
    //localhost:8080/lisa-toode?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true

}

