package edu.davidengel.advancedjava;

public interface ComputerComponent {

    /**
     * Interface to make sure each component can return a cost , manufacturer and type
     * @return
     */
    double getCost();

    String getManufacturer();

    String getType();

}
