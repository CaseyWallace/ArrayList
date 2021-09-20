public class Car {
    private int year;
    private String make;
    private String model;

    public Car(int inYear, String inMake, String inModel) {
        this.year = inYear;
        this.make = inMake;
        this.model = inModel;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int compareTo(Object o) {
        return 0;
    }
}