/*
* This is a program that
* generates two vehicles.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-06-01
*/

import java.util.Scanner;

public final class VehicleInherit {
    private VehicleInherit() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function
    * is the main function.
    * @param args
    */
    public static void main(final String[] args) {
        // input
        System.out.println("Vehicles!\n");
        System.out.println("Not instantiating abstract Vehicle class\n");
        Scanner truckInput = new Scanner(System.in);
        System.out.print("What is the color of the truck: ");

        try {
            String truckColour = truckInput.nextLine();
            System.out.print("Accelerate by: ");
            int truckAccelerate = truckInput.nextInt();
            System.out.print("Brake by: ");
            int truckBrake = truckInput.nextInt();
            System.out.print("How much air is provided: ");
            int amountOfAir = truckInput.nextInt();
            System.out.print("What is the plate number: ");
            String plateNumber = truckInput.next();
            System.out.print("What is the brand: ");
            String brand = truckInput.next();

            // try to instantiate abstract class
            // Vehicle myVehicle = new Vehicle("White");

            // call object
            Truck truck = new Truck(truckColour, brand);

            // pass the states in
            truck.acceleration(truckAccelerate);
            truck.brake(truckBrake);
            truck.setPlateNumber(plateNumber);

            // print the changed state
            System.out.println("\nTruck after:");
            truck.printVehicleInfo();
            System.out.println("Amount of air: "
                               + truck.provideAir(amountOfAir));
            System.out.println("Plate number: "
                               + truck.getPlateNumber());
            System.out.println("Brand: " + truck.getBrand() + "\n");

            System.out.println("--------------------------");

            // input
            System.out.println();
            Scanner bikeInput = new Scanner(System.in);
            System.out.print("What is the color of the bike: ");
            String bikeColour = bikeInput.nextLine();
            System.out.print("Accelerate by: ");
            int bikeAccelerate = bikeInput.nextInt();
            System.out.print("Brake by: ");
            int bikeBrake = bikeInput.nextInt();
            System.out.print("Bike's gear: ");
            int bikeGear = bikeInput.nextInt();
            System.out.print("Bike's tire size: ");
            int bikeTireSize = bikeInput.nextInt();

            System.out.println("Ring the bell!");

            // call object
            Bike bike = new Bike(bikeColour, bikeGear, bikeTireSize);

            // pass the states in
            bike.acceleration(bikeAccelerate);
            bike.brake(bikeBrake);

            // current state
            System.out.println("\nBike after: ");
            bike.printVehicleInfo();
            System.out.println("Cadence: " + bike.getCadence());
            System.out.println("Gear: " + bike.getGear());
            System.out.println("Tire size: " + bike.getTireSize());
            System.out.println(bike.ringBell());

            // get the number of tires of the truck and the bike
            System.out.println("\n# of tires of a truck: " + truck.nOfTires());
            System.out.println("# of tires of a bike: " + bike.nOfTires());

        } catch (Exception err) {
            System.out.println("\nPlease enter an integer");
        }
    }
}
