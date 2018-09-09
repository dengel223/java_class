package edu.davidengel.advancedjava;

public class Cpu implements ComputerComponent {

    private String manufacturer;
    private String type;
    private double cost;
    private double hertz;

    /**
     * Follows the ComputerComponent interface for Cpu component
     * @param manufacturer
     * @param cost
     * @param hertz
     */

    public Cpu(String manufacturer, double cost, double hertz)
    {
        this.manufacturer = manufacturer;
        this.hertz = hertz;
        this.type = "Cpu";
        this.cost = cost;
    }



    public String getManufacturer() {
        return manufacturer;
    }

    public double getHertz() {
        return hertz;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
