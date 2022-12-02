public class AdditionPattern {
    private int startNum;
    private int increment;
    private int currentNum;

    public AdditionPattern(int start, int increment) {
        startNum = start;
        this.increment = increment;
        currentNum = start;
    }

    public int currentNum() {
        return currentNum;
    }

    public void next() {
        currentNum += increment;
    }

    public void prev() {
        if(currentNum != startNum) {
            currentNum -= increment;
        }
    }
}