package edu.davidengel.advancedjava;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ComputerTest {

    private Computer computer;


    public ComputerTest() {
        //setup data
        Cpu cpu = new Cpu("Intel", 200.0d, 4.1);
        Motherboard motherboard = new Motherboard("Intel",300.0d);
        PowerSupply powerSupply = new PowerSupply("Corsair",650,400.0d);

        List<ComputerComponent> components = new ArrayList();
        components.add(cpu);
        components.add(motherboard);
        components.add(powerSupply);

        computer = new Computer( components, 1400, 100, 150000.0d);
    }

    @Test
    public void testProjectedRevenuePositive() {

        double expected = 140000.0;
        assertEquals(computer.calculateProjectedRevenue(), expected, 0.0d);
    }

    //Projected Revenue should be more than 0
    @Test
    public void testProjectedRevenueNegative() {

        double expected = 0.0;
        assertFalse(computer.calculateProjectedRevenue() <= expected);
    }

    @Test
    public void testTotalCostPositive() {

        double expected = 90000.0;
        assertEquals(computer.calculateTotalCost(), expected, 0.0d);
    }

    @Test
    public void testVarianceRevenueNegative() {

        double expected = 0.0;
        assertFalse(computer.calculateTotalCost() <= expected);
    }

    @Test
    public void testProfitPositive() {

        double expected = 50000.0;
        assertEquals(computer.calculateProfit(), expected, 0.0d);
    }

    @Test
    public void testProfitNegative() {

        double expected = 0.0;
        assertFalse(computer.calculateProfit() <= expected);
    }
}
