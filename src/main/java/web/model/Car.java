package web.model;

public class Car {
    private String make;
    private int manufactureYear;
    private String color;

    public Car(String make, int manufactureYear, String color) {
        this.make = make;
        this.manufactureYear = manufactureYear;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
