package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1980, 1, 1);
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName() + " tiene " + person.getAge() + ".");
    }
    
}
