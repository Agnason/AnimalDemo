package animals;

import java.text.DateFormat;
import java.util.Calendar;

public class Cat extends Animal{


    public Cat(String name, Calendar birth) {
        super(name, birth);
        kind=Kind.CAT;
    }


    public Cat() {
        kind=Kind.CAT;
    }
}
