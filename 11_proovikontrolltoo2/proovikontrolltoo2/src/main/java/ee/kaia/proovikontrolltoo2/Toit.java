package ee.kaia.proovikontrolltoo2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toit {
    @Id
    private String nimetus;
    @ManyToMany
    private List<Toidukomponent> toidukomponendid;
}
