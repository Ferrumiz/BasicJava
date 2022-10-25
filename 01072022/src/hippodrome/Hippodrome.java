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

        Cat bobcat = new Bobcat(5, 35);
        Cat houseCat = new HouseCat(2, 15);
        Cat puma = new Puma(13, 60);
        Cat cheetah = new Cheetah(2, 95);

        Dinosaur spinosaurus = new Spinosaurus(67,130);
        Dinosaur stegosaurus = new Stegosaurus(79,15);
        Dinosaur triceratops = new Triceratops(55,17);
        Dinosaur tyrannosaurus = new Tyrannosaurus(90,120);

        Horse heavyHorse = new HeavyHorse(10,50);
        Horse pony = new Pony(12,30);
        Horse raceHorse = new RaceHorse(7,70);
        Horse wingedHorse = new WingedHorse(15,130);

        Spider birdEater = new BirdEater(1,50);
        Spider houseSpider = new HouseSpider(3,20);
        Spider huntsmanSpider = new HuntsmanSpider(2,40);
        Spider wolfSpider = new WolfSpider(1,30);

        List<Raceable> participants = new ArrayList<>();

        participants.add(0, bobcat);
        participants.add(1, houseCat);
        participants.add(2, puma);
        participants.add(3, cheetah);
        participants.add(4, spinosaurus);
        participants.add(5, stegosaurus);
        participants.add(6, triceratops);
        participants.add(7, tyrannosaurus);
        participants.add(8, heavyHorse);
        participants.add(9, pony);
        participants.add(10, raceHorse);
        participants.add(11, wingedHorse);
        participants.add(11, birdEater);
        participants.add(12, houseSpider);
        participants.add(13, huntsmanSpider);
        participants.add(14, wolfSpider);

        for ( Raceable participant : participants ) {
            int startPosition = hippodrome.generateStartPosition(participants.size());
            participant.setPosition(startPosition); //вычисление рандомного числа
        }

        int length = 1000;
        Raceable winner = null;

        //Нужно предположить, что за одну итерацию цикла
        //участник проходит расстояние которое он может пройти за одну секуту S = V*T;
        //По факту к
        boolean isNeedToStop = false;
        while (!isNeedToStop) {

            for ( Raceable participant : participants ) {
                participant.step();
            }

            participants.forEach(participant ->{
                participant.step();
            });

            for ( Raceable participant : participants ) {
                if (participant.isFinished(length)) {
                    isNeedToStop = true;
                    winner = participant;
                    break;
                }
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
