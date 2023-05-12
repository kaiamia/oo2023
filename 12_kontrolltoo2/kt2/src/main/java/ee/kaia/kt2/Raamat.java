package ee.kaia.kt2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Raamat {
    @Id
    private Long id;
    private double maksumus;
    private String nimetus;
    private int lehekylgi;
    @OneToMany
    private List<Novell> novellid;


}
/* Loo klass Raamat, millel on maksumus, nimetus, lehekülgede arv ja novellide kogum võõrvõtmena (üks-mitmele seos,
 *  sest ühel novellil on vaid üks raamat). Arvuta kokku API otspunktist kõikide raamatute kogumaksumus.
 * Võimalda API otspunktist võtta kõige suurema lehekülgede arvuga raamat.*/
