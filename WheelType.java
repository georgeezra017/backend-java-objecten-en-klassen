public class WheelType {
    private String brand;
    private int diameter;
    private String profile;

    public WheelType(String brand, int diameter, String profile) {
        this.brand = brand;
        this.diameter = diameter;
        this.profile = profile;

    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    private void setProfile(String profile) {
        this.profile = profile;
    }

    private String getBrand() {
        return brand;
    }

    private int getDiameter() {
        return diameter;
    }

    private String getProfile() {
        return profile;
    }

    public int topSpeed(){
        return diameter * 10;
    }
}
