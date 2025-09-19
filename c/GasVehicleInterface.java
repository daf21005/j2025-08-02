package c;

// GasVehicle interface
public interface GasVehicleInterface {
    double calcGasMPG();
    void setMilesfromGas(double miles);
    void setGallonsfromGas(double gallons);

    void setCostPerGallon(double costPerGallon);
    double getCostPerGallon();
}