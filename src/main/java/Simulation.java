public class Simulation {
    private Dice dice;
    private Bins bins;
    private int numberOfTosses;
    private int numberOfDies;
    private int lowest;
    private int highest;
    private int numStars;

    public Simulation(int numberOfDies, int numberOfTosses){
        lowest = numberOfDies;
        highest = numberOfDies * 6;
        bins = new Bins(lowest, highest);
        dice = new Dice(numberOfDies);
        this.numberOfTosses = numberOfTosses;
        this.numberOfDies = numberOfDies;
    }


    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        String results = "***\nSimulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n***\n\n";

        for (int i = lowest; i <= highest; i++) {
            results += String.format("%3d : %7d : %3.2f %n", i, bins.getBins(i), bins.percentage(i, bins.total()));
            //results += i + " : " + bins.getBins(i) + " : " + bins.percentage(i, bins.total())+ "\n";
        }

        System.out.print(results);
    }
}
