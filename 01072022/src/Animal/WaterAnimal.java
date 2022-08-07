package Animal;

public class WaterAnimal extends Animal {

    public WaterAnimal(String name) {
        super(name);
    }

    public void swim(){
        System.out.println(" I am " + name + ", I can swim");
    }
}
