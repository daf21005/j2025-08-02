package u;

import c.Hybrid;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

// Test class for the Hybrid vehicle
public class HybridTest {

    private Hybrid testCar;

    // This method runs before each test method
    @Before
    public void setUp() {
        testCar = new Hybrid();
    }

    @Test
    public void testGasMPG() {
        // Arrange
        testCar.setMilesfromGas(120);
        testCar.setGallonsfromGas(6);
        double expectedMpg = 20.0;

        // Act
        double actualMpg = testCar.calcGasMPG();

        // Assert
        assertEquals(expectedMpg, actualMpg, 0.001); // The third argument is a delta for double comparison
    }

    @Test
    public void testElectricMPGe() {
        // Arrange
        testCar.setElectricMiles(300);
        testCar.setTotalKWh(70);
        double expectedMpge = 144.43;

        // Act
        double actualMpge = testCar.calcMPGe();

        // Assert
        assertEquals(expectedMpge, actualMpge, 0.01);
    }

    @Test
    public void testMPGWithZeroGallons() {
        // Arrange
        testCar.setMilesfromGas(100);
        testCar.setGallonsfromGas(0);
        double expectedMpg = 0.0;

        // Act
        double actualMpg = testCar.calcGasMPG();

        // Assert
        assertEquals(expectedMpg, actualMpg, 0.001);
    }
}