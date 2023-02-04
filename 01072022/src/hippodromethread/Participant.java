package hippodromethread;

public abstract class Participant implements Runnable {
    protected long startTime;
    protected long finishTime;

    protected int speed;
    private int currentPosition = 0;

    private int finishPosition;

    public Participant(int speed) {
        this.speed = speed;
    }

    public void setFinishPosition(int finishPosition) {
        this.finishPosition = finishPosition;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        while (!isFinished() && Circle.isNeedStop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            step();
        }
        Circle.isNeedStop = true;
        finishTime = System.currentTimeMillis();
    }

    public void step() {
        currentPosition += speed;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public long getDeltaTime() {
        return this.finishTime-this.startTime;
    }

    private boolean isFinished() {
        return currentPosition >= finishPosition;
    }
}
