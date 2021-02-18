package SetAnimals;

import java.util.HashSet;
import java.util.Set;

abstract class Animal {


    public static Set join(Set cats, Set dogs) {
        HashSet pets = new HashSet(dogs);

        pets.addAll(cats);

        return pets;
    }

    abstract void print();


}

