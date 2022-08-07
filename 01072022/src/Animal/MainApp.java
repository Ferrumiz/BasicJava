package Animal;

public class MainApp {

    public static void main(String[] args) {

        EarthAnimal earthAnimalOne = new EarthAnimal("e one");
        EarthAnimal earthAnimalTwo = new EarthAnimal("e two");

        WaterAnimal waterAnimalOne = new WaterAnimal("w one");
        WaterAnimal waterAnimalTwo = new WaterAnimal("w two");
        WaterAnimal waterAnimalThree = new WaterAnimal("w three");

        lifeCycle(earthAnimalOne, waterAnimalOne, earthAnimalTwo, waterAnimalTwo, waterAnimalThree);

    }

    private static void lifeCycle(Animal... animals) {
        for (Animal animal : animals
        ) {
            animal.born();
            if (animal instanceof  EarthAnimal){
                ((EarthAnimal) animal).walk();
            }

            if (animal instanceof  WaterAnimal){
                ((WaterAnimal) animal).swim();
            }

            animal.finish();
        }
    }
}
