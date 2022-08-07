package Animal;

public class EarthAnimal extends Animal{

    public EarthAnimal(String name) {
        super(name);
    }

    public void walk(){
        System.out.println(" I am " + name + ", I can walk");
    }
}
