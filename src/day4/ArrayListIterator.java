package day4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public ArrayListIterator() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator

//        for (String car : cars) {
//            System.out.println(car);
//        }

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
