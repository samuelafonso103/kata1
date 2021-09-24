package kata1;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Person {
    private final String name;
    private final Calendar birthdate;

    
    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    int getAge() {
        Calendar now = GregorianCalendar.getInstance();
        return msToYears(now.getTimeInMillis() - birthdate.getTimeInMillis());
    }

    private int msToYears(long l) {
        long msPerYear = (long) (365.25*24*60*60*1000);
        return (int) (l/msPerYear);
    }

    
}
