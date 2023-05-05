package ee.kaia.veebipood;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity  //andmebaasitabeliks defineerimine
public class Toode {  //andmebaasi nimi on classi nimi
    @Id
    private int id;
    //standard on panna andmebaasi ID long
    private String nimi;
    private double hind;

}
