/*
* This is a class that has
* the Bike's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-06-01
*/

public final class Bike extends Vehicle {
    /** Cadence of bike. */
    private double cadence;
    /** Number of tires for bike. */
    private int nOfTire;
    /** Tire size for bike. */
    private int tireSize;
    /** Gear for bike. */
    private int gear;
    /** Cadence rate of bike. */
    private static final double CADENCERATE = 0.079;
    /** Number for gear ratio. */
    private static final double FIFTYTHREE = 53;
    /** Number for gear ratio. */
    private static final double TWELVE = 12;

    /**
    * Constructor for bike.
    * @param color
    * @param userGear
    * @param aTireSize
    */
    public Bike(final String color, final int userGear, final int aTireSize) {
        super(color);
        this.cadence = 0;
        this.nOfTire = 2;
        this.gear = userGear;
        this.tireSize = aTireSize;
    }

    /**
    * This is the getter for cadence.
    * @return cadence
    */
    public double getCadence() {
        /* When the speed unit is km/h,
        for an average bicycle, the formula is
        cadence = speed/(.079 x gear ratio).
        Also, the average gear ratio is 53/12. */
        this.cadence = super.getSpeed() / (CADENCERATE * (FIFTYTHREE / TWELVE));
        return this.cadence;
    }

    /**
    * This is a getter for gear.
    * @return gear
    */
    public int getGear() {
        return this.gear;
    }

    /**
    * This is a setter for gear.
    * @param userGear
    */
    public void setGear(final int userGear) {
        this.gear = userGear;
    }

    /**
    * This is a getter for tireSize.
    * @return tireSize
    */
    public int getTireSize() {
        return this.tireSize;
    }

    /**
    * This is a setter for tireSize.
    * @param someTireSize
    */
    public void serTireSize(final int someTireSize) {
        this.tireSize = someTireSize;
    }

    /**
    * This method rings the bell.
    * @return Ring, Ring
    */
    public String ringBell() {
        return "Ring, Ring!";
    }

    /**
    * This method returns the number of tires.
    * @return nOfTire
    */
    public int nOfTires() {
        return nOfTire;
    }
}
