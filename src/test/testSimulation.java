import org.junit.Assert;
import org.junit.Test;

public class testSimulation {
    @Test
    public void runSimulationTest() {
        //Given
        Simulation simulation = new Simulation(1, 1);

        //When
        simulation.runSimulation();

        //Then
        Integer expected = 1;
        Integer actual = simulation.getBins().total();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void runSimulationTest2() {
        //Given
        Simulation simulation = new Simulation(1, 6);

        //When
        simulation.runSimulation();

        //Then
        Integer expected = 6;
        Integer actual = simulation.getBins().total();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printStarsTest() {
        //Given
        Simulation simulation = new Simulation(1, 1);

        //When
        simulation.runSimulation();

        //Then
        String expected = "******";
        String actual = simulation.printStars(.06f);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printStarsTest2() {
        //Given
        Simulation simulation = new Simulation(1, 1);

        //When
        simulation.runSimulation();

        //Then
        String expected = "****************";
        String actual = simulation.printStars(.16f);
        Assert.assertEquals(expected, actual);

    }

}
