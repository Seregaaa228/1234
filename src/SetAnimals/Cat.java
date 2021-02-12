package SetAnimals;


import java.util.HashSet;
import java.util.Set;

public class Cat extends Animals {



    public static Set createCats() {
        HashSet<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }
    public static  void  removeCats(Set pets){
        Set copy = new HashSet<>();
        copy.addAll(pets);
        for (Object pet : copy){
           if (pet instanceof  Cat){
               pets.remove(pet);
           }

        }
    }

    @Override
    public String toString() {
        return "Cat";
    }

}
