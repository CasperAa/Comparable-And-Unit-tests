import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("Erik", 1.78, 23);
        Person Person2 = new Person("Mark", 1.86, 27);
        Person Person3 = new Person("Heidi", 1.58, 27);
        Person Person4 = new Person("Anna", 1.64, 23);
        Person Person5 = new Person("Kenneth", 1.74, 19);


        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(Person1, Person2, Person3, Person4, Person5));


        Collections.sort(personList);
        Collections.reverse(personList);

        System.out.println("The natual order:\n");
        int i = 1;
        for(Person currentPerson: personList){
            System.out.println("Person: " + i + " - " + currentPerson.name +' '+ currentPerson.age +' '+ currentPerson.height);
            i++;
        }
    }
}
