package SetAnimals;



import java.util.Set;

import static SetAnimals.Animals.join;
import static SetAnimals.Animals.printPets;
import static SetAnimals.Cat.createCats;
import static SetAnimals.Cat.removeCats;
import static SetAnimals.Dog.createDogs;

public class Main {

    public static void main(String[] args) {
     Set cats = createCats();
      Set dogs =  createDogs();
      Set pets = join(cats, dogs);

        removeCats(pets);
        printPets(pets);


    }


}
