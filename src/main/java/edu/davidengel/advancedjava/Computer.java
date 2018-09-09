package edu.davidengel.advancedjava;

import java.util.List;

public class Computer {



    //Computer Components
    private List<ComputerComponent> components;
    private double salePrice;
    private int targetQty;
    private double targetRevenue;

    /**
     * Creates a new computer build using a list of components
     * Example of dependency injection because the components are an interface.
     * The existing components can be modified or new components created and this class does not
     * need to be altered because it is not dependent on the classes that implement
     * the computer component interface, only the interface itself. I could add a component
     * for Memory/Ram and this class would still work fine and use that new data.
     *
     * @param components - A list of interfaced computer components
     * @param salePrice - computer selling price
     * @param targetQty - how many computers to sell
     * @param targetRevenue - total revenue in sales
     *
     *
     */

    public Computer(List<ComputerComponent> components,
                    double salePrice, int targetQty, double targetRevenue)
    {
        this.components = components;
        this.salePrice = salePrice;
        this.targetQty = targetQty;
        this.targetRevenue = targetRevenue;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public int getTargetQty() {
        return targetQty;
    }

    public List<ComputerComponent> getComponents() {
        return components;
    }


    public double getTargetRevenue() {
        return targetRevenue;
    }


    /**
     * Calculates the projected revenue which is the qty * price
     * @return - revenue as double
     */
    public double calculateProjectedRevenue() {
        return salePrice * targetQty;
    }

    /**
     * Calculates the total cost by iterating through the components and accessing their cost
     * Then multiplies the sum of the component costs by the qty for total cost
     * @return - cost as double
     */
    public double calculateTotalCost() {
        double totalCost = 0.0d;
        for (ComputerComponent component : components) {
            totalCost += component.getCost();
        }
        return totalCost * targetQty;
    }

    /**
     * Calculates the profit by subtracting the total cst from the total revenue
     * @return - revenue as double
     */
    public double calculateProfit() {
        return calculateProjectedRevenue() - calculateTotalCost();
    }
}
