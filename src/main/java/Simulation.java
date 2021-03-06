public class Simulation {
    private Dice dice;
    private Bins bins;
    private int numberOfTosses;
    private int numberOfDies;
    private int lowest;
    private int highest;

    public Simulation(int numberOfDies, int numberOfTosses){
        lowest = numberOfDies;
        highest = numberOfDies * Dice.JUST__Some_SidEsdfSIDES;
        bins = new Bins(lowest, highest);
        dice = new Dice(numberOfDies);
        this.numberOfTosses = numberOfTosses;
        this.numberOfDies = numberOfDies;
    }

    public Bins getBins() {
        return bins;
    }


    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public String printStars(float percentage) {
        int numberStars = (int) Math.floor(percentage * 100);
        String stars = "";
        for (int i = 0; i < numberStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public String printResults() {
        StringBuilder results = new StringBuilder("***\nSimulation of " + numberOfDies + " dice tossed " +
                                                    numberOfTosses + " times.\n***\n\n");

        for (int i = lowest; i <= highest; i++) {
            float percentage = bins.percentage(i, bins.total());
            results.append(String.format("%3d : %5d : %3.2f %s %n", i, bins.getBins(i), percentage, printStars(percentage)));
        }

        results.append("\n Happy Gaming!!\n");

        System.out.print(results.toString());
        return results.toString();
    }
}
