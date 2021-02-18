package SetAnimals;



import java.util.Set;

import static SetAnimals.Animal.join;

import static SetAnimals.Cat.createCats;
import static SetAnimals.Cat.removeCats;
import static SetAnimals.Dog.createDogs;

public class Main {

    public static void main(String[] args) {
        Set<Animal> animals = join(createDogs(), createCats());
        removeCats(animals);
        for (Animal an : animals) {
            an.print();
        }
    }
}
