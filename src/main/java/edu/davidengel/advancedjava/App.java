package edu.davidengel.advancedjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //setup data
        //better injection code can be used here
        Cpu cpu = new Cpu("Intel", 200.0d, 4.1);
        Motherboard motherboard = new Motherboard("Intel",300.0d);
        PowerSupply powerSupply = new PowerSupply("Corsair",650,400.0d);

        List<ComputerComponent> components = new ArrayList();
        components.add(cpu);
        components.add(motherboard);
        components.add(powerSupply);

        Computer computer = new Computer( components, 1400, 100, 150000.0d);

        System.out.println( "Created Computer Has the following info:" );

        System.out.println("Target Revenue: " + computer.getTargetRevenue());

        System.out.println("Projected Revenue: " + computer.calculateProjectedRevenue());

        System.out.println("Projected Profit: " + computer.calculateProfit());

        System.out.println("Total Cost: " + computer.calculateTotalCost());

    }
}
