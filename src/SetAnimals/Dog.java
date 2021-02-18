package SetAnimals;

import java.util.HashSet;
import java.util.Set;

public class Dog extends Animal {

    public static Set createDogs() {
        HashSet result = new HashSet();

        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }

        return result;
    }

    @Override
    void print() {
        System.out.println("Dog");
    }
}
