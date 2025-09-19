package c;

// Hybrid class implementing both interfaces
public class Hybrid implements ElectricVehicleInterface, GasVehicleInterface {
    private double electricMiles;
    private double totalKWh;
    private double costPerKWh;

    private double costPerGallon;
    private double milesFromGas;
    private double gallonsFromGas;


    // ElectricVehicle methods
    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.electricMiles = totalElectricMiles;
    }

    @Override
    public void setTotalKWh(double totalKWh) {
        this.totalKWh = totalKWh;
    }

    @Override
    public void setCostPerKWh(double costPerKWh) {
        this.costPerKWh = costPerKWh;
    }

    @Override
    public double getCostPerKWh() {
        return costPerKWh;
    }

    @Override
    public double calcMPGe() {
    // MPGe = (miles / kWh) * 33.7 kWh/gallon
    if (totalKWh == 0) {
        return 0; // Avoid division by zero
    }
    return (electricMiles / totalKWh) * 33.7;
}

    // GasVehicle methods
    @Override
    public void setMilesfromGas(double miles) {
        this.milesFromGas = miles;
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallonsFromGas = gallons;
    }

    @Override
    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;
    }

    @Override
    public double getCostPerGallon() {
        return this.costPerGallon;
    }

    @Override
    public double calcGasMPG() {
    // MPG = miles / gallons
    if (gallonsFromGas == 0) {
        return 0;
    }
    return milesFromGas / gallonsFromGas;
    }
}