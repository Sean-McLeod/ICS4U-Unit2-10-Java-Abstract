/*
* This is a class that has
* the Truck's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-06-01
*/

public final class Truck extends Vehicle {
    /** Plate Number. */
    private String plateNumber;
    /** Number of tires for truck. */
    private int nOfTire;
    /** # of tires. */
    private static final int FOUR = 4;
    /** Brand for truck. */
    private String brand;

    /**
    * Constructor for truck.
    * @param color
    * @param userBrand
    */
    public Truck(final String color, final String userBrand) {
        super(color);
        this.plateNumber = null;
        this.nOfTire = FOUR;
        this.brand = userBrand;
    }

    /**
    * This is a getter for plateNumber.
    * @return plateNumber
    */
    public String getPlateNumber() {
        return this.plateNumber;
    }

    /**
    * This is a setter for plateNumber.
    * @param userPlate
    */
    public void setPlateNumber(final String userPlate) {
        this.plateNumber = userPlate;
    }

    /**
    * This is a getter for brand.
    * @return brand
    */
    public String getBrand() {
        return this.brand;
    }

    /**
    * This method gets
    * the amount of air and returns it.
    * @param amountOfAir
    * @return amountOfAir
    */
    public int provideAir(final int amountOfAir) {
        return amountOfAir;
    }

    /**
    * This method returns the number of tires.
    * @return nOfTire
    */
    public int nOfTires() {
        return nOfTire;
    }
}
