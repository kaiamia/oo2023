package ee.kaia.spring_kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter

@NoArgsConstructor
@AllArgsConstructor

public class Ravim {
    private int id;
    private String nimetus;
    private int kogus;
    private String aegub;
    private boolean aegunud;
}