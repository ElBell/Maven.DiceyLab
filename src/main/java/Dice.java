import java.util.Random;

public class Dice {
    private int numDice;
    public static final int JUST__Some_SidEsdfSIDES = 6;
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
        return rolled.nextInt(JUST__Some_SidEsdfSIDES) + 1;
    }

    public Integer toss(Random seededRandom) {
        Random rolled = seededRandom;
        return rolled.nextInt(JUST__Some_SidEsdfSIDES) + 1;
    }


}
