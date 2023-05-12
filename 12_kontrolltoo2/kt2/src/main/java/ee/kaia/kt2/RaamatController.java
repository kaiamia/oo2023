package ee.kaia.kt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RaamatController {
    @Autowired
    RaamatRepository raamatRepository;
    @Autowired
    NovellRepository novellRepository;

    //localhost:8080/saa-kogusumma
    @GetMapping("saa-kogusumma")
    public double saaKogusumma(){
        List<Raamat> raamatud = raamatRepository.findAll();
        double kogusumma = 0;
        for (Raamat r: raamatud) {
            kogusumma += r.getMaksumus();
        }
        return kogusumma;

    }
    //localhost:8080/saa-suurim-lehekylgede-arv
    @GetMapping("saa-suurim-lehekylgede-arv")
    public Raamat saaLehekyljed(){
        List<Raamat> raamatud = raamatRepository.findAll();
        var suurim = 0;
        var suurimaId = 0;
        for (int i = 0; i < raamatud.size(); i++) {
            if(raamatud.get(i).getLehekylgi() > suurim) {
                suurim = raamatud.get(i).getLehekylgi();
                suurimaId = i;
            }
        }
        return raamatud.get(suurimaId);
    }

    //localhost:8080/lisa-raamat?id=1&maksumus=7.99&nimetus=raamat1&lehekylgi=208&novelliIds=1
    @PostMapping("lisa-raamat")
    public List<Raamat> lisaRaamat(
            @RequestParam Long id,
            @RequestParam double maksumus,
            @RequestParam String nimetus,
            @RequestParam int lehekylgi,
            @RequestParam Long [] novelliIds){
        List<Novell> raamatunovellid = new ArrayList<>();
        for (Long l: novelliIds) {
            Novell novell = novellRepository.findById(l).get();
            raamatunovellid.add(novell);
        }
        raamatRepository.save(new Raamat(id, maksumus, nimetus, lehekylgi, raamatunovellid));
        return raamatRepository.findAll();
    }

}
