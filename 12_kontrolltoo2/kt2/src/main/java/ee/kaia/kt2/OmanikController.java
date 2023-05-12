package ee.kaia.kt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OmanikController {
    @Autowired
    RaamatRepository raamatRepository;
    @Autowired
    OmanikRepository omanikRepository;

    //localhost:8080/saa-raamatuid?id=1
    @GetMapping("saa-raamatuid")
    public int saaRaamatuid(
            @RequestParam Long id){
        //List<Omanik> omanikud = omanikRepository.findAll();
        Omanik omanik = omanikRepository.findById(id).get();
        return omanik.getRaamatud().size();
    }

    //localhost:8080/lisa-omanik?id=1&raamatuteIds=1,2
    @PostMapping("lisa-omanik")
    public List<Omanik> lisaOmanik(
            @RequestParam Long id,
            @RequestParam Long [] raamatuteIds){
        List<Raamat> omanikuraamatud = new ArrayList<>();
        for (Long l: raamatuteIds) {
            Raamat raamat = raamatRepository.findById(l).get();
            omanikuraamatud.add(raamat);
        }
        omanikRepository.save(new Omanik(id, omanikuraamatud));
        return omanikRepository.findAll();
    }
    //localhost:8080/leia-novellide-arv?id=1
    @GetMapping("leia-novellide-arv")
    public int novellideArv(
            @RequestParam Long id
    ){
        Omanik omanik = omanikRepository.findById(id).get();
        List<Raamat> raamatud = omanik.getRaamatud();
        int novelle = 0;
        for (int i = 0; i < raamatud.size(); i++) {
            novelle += raamatud.get(i).getNovellid().size();
        }
        return novelle;
    }
    //localhost:8080/saa-raamatute-kogumaksumus
    @GetMapping("saa-raamatute-kogumaksumus")
    public double raamatuteKogumaksumus(
            @RequestParam Long id){
        Omanik omanik = omanikRepository.findById(id).get();
        List<Raamat> raamatud = omanik.getRaamatud();
        double kogumaksumus = 0;
        for (int i = 0; i < raamatud.size(); i++) {
            kogumaksumus += raamatud.get(i).getMaksumus();
        }
        return kogumaksumus;
    }
}
