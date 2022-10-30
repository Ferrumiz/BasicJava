package mth;

import static mth.WaitExample.summ;

public class ExternalCalculator extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            try {
//                Thread.sleep(1000);
                summ++;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

