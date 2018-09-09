package edu.davidengel.advancedjava;

public class Motherboard implements ComputerComponent {

    private String manufacturer;
    private String type;
    private double cost;

    /**
     * Follows the ComputerComponent interface for Motherboard component
     * @param manufacturer
     * @param cost
     */


    public Motherboard(String manufacturer, double cost)
    {
        this.manufacturer = manufacturer;
        this.type = "Motherboard";
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

}
