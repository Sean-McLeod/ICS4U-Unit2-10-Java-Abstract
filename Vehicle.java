/*
* This is a class that has
* the Vehicle's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-06-01
*/

public abstract class Vehicle {
    /** This is the colour. */
    private String colour;
    /** This is the speed. */
    private int speed;
    /** This is the maximum speed. */
    private int maxSpeed;
    /** This is the value of maximum speed. */
    private static final int HUNDRED = 100;

    /**
    * This is the constructor for the superclass Vehicle.
    * @param color
    */
    public Vehicle(final String color) {
        this.colour = color;
        this.speed = 0;
        this.maxSpeed = HUNDRED;
    }

    /**
    * This method gets
    * the value of colour.
    * @return colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * This method gets
    * the value of speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method gets
    * the value of maxSpeed.
    * @return maxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * This method sets
    * the value of colour.
    * @param colourString
    */
    public void setColour(final String colourString) {
        this.colour = colourString;
    }

    /**
    * This method changes the speed
    * depending on the acceleration.
    * @param increment
    */
    public void acceleration(final int increment) {
        if (increment < 0) {
            System.out.println("# Please enter in a positive number.");
            System.out.println("# Your input won't affect the speed.");
        } else if (this.speed + increment > this.maxSpeed) {
            System.out.println("# Your input is greater than "
                               + "the maximum speed.");
            System.out.println("# Speed has automatically set "
                               + "to maximum speed.");
            this.speed = this.maxSpeed;
        } else {
            this.speed += increment;
        }
    }

    /**
    * This method changes the speed
    * depending on the brake.
    * @param decrement
    */
    public void brake(final int decrement) {
        if (decrement < 0) {
            System.out.println("# Please enter in a positive number.");
            System.out.println("# Your input won't affect the speed.");
        } else if (this.speed - decrement < 0) {
            System.out.println("# Your speed is less than the "
                               + "minimum speed.");
            System.out.println("# Speed has automatically set to 0.");
            this.speed = 0;
        } else {
            this.speed -= decrement;
        }
    }

    /** This method prints out the vehicle's info. */
    public void printVehicleInfo() {
        System.out.println("Colour: " + this.colour);
        System.out.println("Speed: " + this.speed);
        System.out.println("Maximum speed: " + this.maxSpeed);
    }
}
