package ee.kaia.spring_kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IsikuRavimid {
    private int id;
    private Isik omanik;
    private List<Ravim> ravimid;
}
