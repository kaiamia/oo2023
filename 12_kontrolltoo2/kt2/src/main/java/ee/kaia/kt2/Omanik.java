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
public class Omanik {
    @Id
    private Long id;
    @OneToMany
    private List<Raamat> raamatud;
}
/*Loo klass Omanik. Lisa talle Raamatute hulk võõrvõtmena (üks-mitmele seos).
* Väljasta API otspunkti kaudu ühe omaniku tunnus sisendiks andes kõikide raamatute hulk numbrina.
* Väljasta API otspunkti kaudu ühe omaniku kõikide novellide hulk.
* Arvuta ühe omaniku kõikide raamatute kogumaksumus.*/