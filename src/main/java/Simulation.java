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

    public String printStars(float percentage) {
        int numberStars = (int) Math.floor(percentage * 100);
        String stars = "";
        for (int i = 0; i < numberStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public void printResults() {
        String results = "***\nSimulation of " + numberOfDies + " dice tossed " + numberOfTosses + " times.\n***\n\n";

        for (int i = lowest; i <= highest; i++) {
            float percentage = bins.percentage(i, bins.total());
            results += String.format("%3d : %5d : %3.2f %s %n", i, bins.getBins(i), percentage, printStars(percentage));
            //results += i + " : " + bins.getBins(i) + " : " + bins.percentage(i, bins.total())+ "\n";
        }

        results += "\n Happy Gaming!!\n";

        System.out.print(results);
    }
}
