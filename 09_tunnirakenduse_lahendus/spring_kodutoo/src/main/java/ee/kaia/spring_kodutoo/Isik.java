package ee.kaia.spring_kodutoo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Isik {
    private int id;
    private String eesnimi;
    private String perenimi;
}
