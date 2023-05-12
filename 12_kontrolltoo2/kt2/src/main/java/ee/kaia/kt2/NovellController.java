package ee.kaia.kt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NovellController {
    @Autowired
    NovellRepository novellRepository;

    //localhost:8080/lisa-novell?id=1&pealkiri=novell1&sisu=see+on+esimene+novell
    @PostMapping("lisa-novell")
    public List<Novell> LisaNovell(
            @RequestParam Long id,
            @RequestParam String pealkiri,
            @RequestParam String sisu) throws Exception {
        /*if (sisu.length() < 10) {
            throw new Exception("Sisu peab olema vähemalt 10 tähemärki");
        }*/
        int count = 0;
        for (int i = 0; i < sisu.length(); i++) {
            if (Character.isLetter(sisu.charAt(i)))
                count++;
        }
        if (count < 10) {
            throw new Exception("Sisu peab olema vähemalt 10 tähemärki");
        }
        novellRepository.save(new Novell(id, pealkiri, sisu));
        return novellRepository.findAll();
    }

    //localhost:8080/saa-tahed?id=1
    @GetMapping("saa-tahed")
    public int saaTahed(
            @RequestParam Long id){
        Novell novell = novellRepository.findById(id).get();
        String sisu = novell.getSisu();
        int count = 0;
        for (int i = 0; i < sisu.length(); i++) {
            if (Character.isLetter(sisu.charAt(i)))
                count++;
        }
        return count;
    }
}
