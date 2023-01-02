package collectionsUtils;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {//implement compare method from Comparator interface
        //implement a certain logic
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }
}
