package kata1;


import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    int getAge() {
        LocalDate now = LocalDate.now();
        Period p = birthdate.until(now);
        return p.getYears();
    }

    
}
