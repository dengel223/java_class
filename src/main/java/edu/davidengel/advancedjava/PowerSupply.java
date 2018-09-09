package edu.davidengel.advancedjava;

public class PowerSupply implements ComputerComponent {

    private String manufacturer;
    private Integer outputWattage;
    private String type;
    private double cost;


    /**
     * Follows the ComputerComponent interface for power supply component
     * @param manufacturer
     * @param outputWattage
     * @param cost
     */

    public PowerSupply(String manufacturer, Integer outputWattage, double cost)
    {
        this.manufacturer = manufacturer;
        this.outputWattage = outputWattage;
        this.type = "PowerSupply";
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getOutputWattage() {
        return outputWattage;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }


}
