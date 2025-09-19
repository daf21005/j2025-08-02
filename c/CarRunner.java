package c;

// This class will be the entry point of your program
public class CarRunner {

    // The main method where the program execution begins
    public static void main(String[] args) {

        Hybrid myCar = new Hybrid();

        // --- A First Set of Examples ---
        // --- A Second Set of Examples --- (copied twice for clarity)
        // The MPG when in fully gas mode
        System.out.println("--- First Set of Examples ---");
        System.out.println("--- Fully Gas Mode ---");
        myCar.setMilesfromGas(120);
        myCar.setGallonsfromGas(6);
        double mpg = myCar.calcGasMPG();
        System.out.printf("MPG: %.2f miles/gallon\n", mpg); // %.2f formats the output to 2 decimal places

        // The MPGe when in fully electric mode
        System.out.println("\n--- Fully Electric Mode ---");
        // Example from the lab: 300 miles using 70 kWh
        myCar.setElectricMiles(300);
        myCar.setTotalKWh(70);
        double mpge = myCar.calcMPGe();
        System.out.printf("MPGe: %.2f miles/gallon equivalent\n", mpge);

        // The average MPG (MPG + MPGe)/2 when in half-gas/half-electric hybrid mode
        System.out.println("\n--- Hybrid Mode ---");
        double hybridMPG = (mpg + mpge) / 2;
        System.out.printf("Average MPG in hybrid mode: %.2f miles/gallon\n", hybridMPG);

        // Demonstrate cost calculations
        System.out.println("\n--- Cost Calculations ---");
        double gasolineCostPerGallon = 3.50; // $3.50/gallon
        double electricityCostPerKWh = 0.24; // $0.24/kWh
        // Calculate cost for the gas trip (120 miles)
        double totalGallons = 120 / myCar.calcGasMPG();
        double totalGasCost = totalGallons * gasolineCostPerGallon;
        System.out.printf("Total cost for 120-mile gas trip: $%.2f\n", totalGasCost);

        // Calculate cost for the electric trip (300 miles)
        double totalKWhUsed = 70;
        double totalElectricCost = totalKWhUsed * electricityCostPerKWh;
        System.out.printf("Total cost for 300-mile electric trip: $%.2f\n", totalElectricCost);

        // --- A Second Set of Examples ---
        // --- A Second Set of Examples --- (copied twice for clarity)
        System.out.println("\n--- Second Set of Examples ---");
        
        // Different values for a new gas-only trip
        System.out.println("--- New Gas Trip ---");
        myCar.setMilesfromGas(250);
        myCar.setGallonsfromGas(10);
        double newMpg = myCar.calcGasMPG();
        System.out.printf("New MPG: %.2f miles/gallon\n", newMpg);
        double newGasCost = (250 / myCar.calcGasMPG()) * gasolineCostPerGallon;
        System.out.printf("Total cost for 250-mile new gas trip: $%.2f\n", newGasCost);

        // Different values for a new electric-only trip
        System.out.println("\n--- New Electric Trip ---");
        myCar.setElectricMiles(150);
        myCar.setTotalKWh(40);
        double newMpge = myCar.calcMPGe();
        System.out.printf("New MPGe: %.2f miles/gallon equivalent\n", newMpge);
        double newElectricCost = 40 * electricityCostPerKWh;
        System.out.printf("Total cost for 150-mile new electric trip: $%.2f\n", newElectricCost);
    }

}