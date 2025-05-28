public class Car {
    private int motorinhoud;
    private int topspeed;
    private String color;
    private String fueltype;
    private String brandname;

    private WheelType wheelType;
    private Engine engine;
    private int fuel;

    public Car(String color, String fueltype, String brandname, WheelType wheelType, Engine engine) {
        this.motorinhoud = engine.getVolume();
        this.topspeed = wheelType.topSpeed();
        this.color = color;
        this.fueltype = fueltype;
        this.brandname = brandname;
        this.wheelType = wheelType;
        this.engine = engine;
        this.fuel = 0;

    }

    public void refuel(int amount){
        this.fuel += amount;
    }

    public int getFuel() {
        return this.fuel;
    }

    public int getMotorinhoud() {
        return motorinhoud;
    }

    public void setMotorinhoud(int motorinhoud) {

        this.motorinhoud = motorinhoud;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

}

