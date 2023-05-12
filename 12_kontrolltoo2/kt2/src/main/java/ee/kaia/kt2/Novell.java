package ee.kaia.kt2;
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
@Entity
public class Novell {
    @Id
    private Long id;
    private String pealkiri;
    private String sisu;
}
/*
* Loo klass Novell väljadega pealkiri ja sisu. Koosta andmebaasi tabel, kuhu saab kirju lisada.
* Kui sisu on lühem kui 10 tähte, väljasta veateade.
* Väljasta API otspunktist sisendiks novelli ID andes sisu tähtede arv numbrina.
* */