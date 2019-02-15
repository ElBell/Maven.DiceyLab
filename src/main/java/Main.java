public class Main {
    public static void main(String[] args){
        Simulation simulation = new Simulation(2,16000);
        simulation.runSimulation();
        simulation.printResults();
    }
}
