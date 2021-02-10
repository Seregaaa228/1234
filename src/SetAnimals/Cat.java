package SetAnimals;

import java.util.HashSet;
import java.util.Set;

public class Cat extends Animals {

    public static Set createCats() {
        HashSet result = new HashSet();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }
    public static  void  removeCats(Set pets,Set cats){
        pets.removeAll(cats);
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
