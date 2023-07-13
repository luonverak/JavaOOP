package Exercise3;
public class MainFunction {
    public static void main(String[] args) {
        
        Zoo zoo = new Zoo();
        
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.makeSounds();
        

    }
}
