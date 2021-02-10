package SetAnimals;

import java.util.HashSet;
import java.util.Set;

abstract class Animals {

    public static Set join(Set cats, Set dogs) {
        HashSet pets = new HashSet(dogs);

        pets.addAll(cats);

        return pets;
    }

    public static void printPets(Set pets) {
        for (Object object : pets) {
            System.out.println(object);
        }
    }
}
