package ee.kaia.spring_kodutoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class IsikuRavimidController {
    @Autowired
    IsikController isikController;
    @Autowired
    RavimListController ravimListController;

    List<Ravim> isikuRavimid = new ArrayList<>(Arrays.asList(
            new Ravim(1,"Paracetamol", 37, "4.06.2024", false),
            new Ravim(2, "Kurgupastill", 5, "15.01.2025", false)
    ));
    List<Ravim> isiku2Ravimid = new ArrayList<>(Arrays.asList(
            new Ravim(3,"ACC", 3, "24.08.2023", false),
            new Ravim(4,"Ibumetin", 17, "4.06.2022", true)
    ));
    Isik omanik = new Isik(1, "Ees", "Pere");
    Isik omanik2 = new Isik(2, "Ees", "Pere");
    List<IsikuRavimid> omandid = new ArrayList<>(Arrays.asList(
            new IsikuRavimid(1, omanik, isikuRavimid),
            new IsikuRavimid(2, omanik2, isiku2Ravimid)

    ));

    @DeleteMapping("kustuta-ravimid/{index}")
    public String kustutaRavimid(@PathVariable int index) {
        omandid.remove(index);
        return "Tema ravimid on kustutatud!";
    }

    @PostMapping("lisa-ravimid")
    public List<IsikuRavimid> lisaRavimid(
            @RequestParam int id,
            @RequestParam int isikuIndex,
            @RequestParam int ravimiIndex) {

        Isik omanik = isikController.isikud.get(isikuIndex);

        Ravim ravim = ravimListController.ravimid.get(ravimiIndex);
        List<Ravim> ravimid = new ArrayList<>(Arrays.asList(ravim));

        omandid.add(new IsikuRavimid(id, omanik, ravimid));
        return omandid;
    }
    @PostMapping("lisa-ravimid2")
    public List<IsikuRavimid> lisaRavimid(
            @RequestBody IsikuRavimid omand) {
        Isik isik = isikController.isikud.get(omand.getOmanik().getId());

        List<Ravim> ravimid = new ArrayList<>();
        for (Ravim t: omand.getRavimid()) {
            Ravim ravim = ravimListController.ravimid.get(t.getId());
            ravimid.add(ravim);
        }

        omandid.add(new IsikuRavimid(omand.getId(), isik, ravimid));
        return omandid;
    }
}
