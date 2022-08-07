package ippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) {

        Hippodrome hippodrome = new Hippodrome();

        List<Raceable> participants = new ArrayList<>();
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
        private int generateStartPosition ( int size){
            //Здесь генерируем позицию
            return 0;
        }
    }
