
package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    
    List<Animal> list = new ArrayList<>();

    public void addAnimal(Animal animal){
        list.add(animal);
    }
    public void makeSounds() {
        for (int i=0; i<list.size(); i++) {
            list.get(i).makeSound();
        }
    }
    
}
