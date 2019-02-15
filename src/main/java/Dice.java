import java.util.Random;

public class Dice {
    private int numDice;
    public Dice (int numDice) {
        this.numDice = numDice;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        for (int i = 0; i < numDice; i++) {
            sum += toss();
        }
        return sum;
    }

    public Integer toss() {
        Random rolled = new Random();
        return rolled.nextInt(6) + 1;
    }

    public Integer toss(Random seededRandom) {
        Random rolled = seededRandom;
        return rolled.nextInt(6) + 1;
    }


}
