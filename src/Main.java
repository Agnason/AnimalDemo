import animals.Cat;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List <Cat> catList=new ArrayList<>();
        catList.add(new Cat("Tosik",new GregorianCalendar(2020, Calendar.APRIL,20)));
        catList.add(new Cat("Vasia",new GregorianCalendar(2021, Calendar.AUGUST,20)));
        catList.add(new Cat ());

        CounterAnimal counterAnimal=new CounterAnimal();
        counterAnimal.add(catList.get(2));
        counterAnimal.add(catList.get(0));
        System.out.println(counterAnimal.counter);
    }
}
