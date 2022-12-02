public class GameSpinner {
    private int sectors;
    private int currentRun;
    private int runningNum;

    public GameSpinner(int s) {
        sectors = s;
        currentRun = 0;
        runningNum = 0;
    }

    public int spin() {
        int rand = (int) (Math.random() * sectors) + 1;
        if (runningNum == rand) {
           currentRun++;
        } else {
            currentRun = 1;
            runningNum = rand;
        }

        return rand;
    }

    public int currentRun() {
        return currentRun;
    }
}