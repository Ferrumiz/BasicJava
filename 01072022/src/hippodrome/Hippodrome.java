package hippodrome;

import hippodrome.cat.*;
import hippodrome.dinosaur.*;
import hippodrome.horses.*;
import hippodrome.spider.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hippodrome {
    public static void main(String[] args) {

        Hippodrome hippodrome = new Hippodrome();

        Cat bobcat = new Bobcat();
        Cat houseCat = new HouseCat();
        Cat puma = new Puma();
        Cat cheetah = new Cheetah();

        Dinosaur spinosaurus = new Spinosaurus();
        Dinosaur stegosaurus = new Stegosaurus();
        Dinosaur triceratops = new Triceratops();
        Dinosaur tyrannosaurus = new Tyrannosaurus();

        Horse heavyHorse = new HeavyHorse();
        Horse pony = new Pony();
        Horse raceHorse = new RaceHorse();
        Horse wingedHorse = new WingedHorse();

        Spider birdEater = new BirdEater();
        Spider houseSpider = new HouseSpider();
        Spider huntsmanSpider = new HuntsmanSpider();
        Spider wolfSpider = new WolfSpider();

        List<Raceable> participants = new ArrayList<>();

        participants.add(0, (Raceable) bobcat);
        participants.add(1, (Raceable) houseCat);
        participants.add(2, (Raceable) puma);
        participants.add(3, (Raceable) cheetah);
        participants.add(4, (Raceable) spinosaurus);
        participants.add(5, (Raceable) stegosaurus);
        participants.add(6, (Raceable) triceratops);
        participants.add(7, (Raceable) tyrannosaurus);
        participants.add(8, (Raceable) heavyHorse);
        participants.add(9, (Raceable) pony);
        participants.add(10, (Raceable) raceHorse);
        participants.add(11, (Raceable) wingedHorse);
        participants.add(11, (Raceable) birdEater);
        participants.add(12, (Raceable) houseSpider);
        participants.add(13, (Raceable) huntsmanSpider);
        participants.add(14, (Raceable) wolfSpider);


        for (Raceable participant : participants) {
            int startPosition = hippodrome.generateStartPosition(participants.size());
            participant.setPosition(startPosition); //вычисление рандомного числа
        }

        int length = 1000;
        Raceable winner = null;

        while (true) {
            for (Raceable participant : participants) {
                participant.step();
            }

            boolean isNeedToStop = false;

            for (Raceable participant : participants) {
                if (participant.isFinished(length)) {
                    isNeedToStop = true;
                    winner = participant;
                    break;
                }
            }

            if (isNeedToStop) {
                break;
            }
        }

        //вывести информацию о победителе winner
        winner.printInformation();
    }

    private int generateStartPosition(int size) {
        //Здесь генерируем позицию
        Random random = new Random();
        int startPosition = 36 + random.nextInt(size + 1);
        return startPosition;
    }
}
