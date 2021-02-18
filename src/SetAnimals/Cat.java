package SetAnimals;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cat extends Animal {


    public static Set createCats() {
        HashSet<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static void removeCats(Set animals) {
        animals.removeIf(o -> o instanceof Cat);

    }


    @Override
    void print() {
        System.out.println("Cat");
    }
}
