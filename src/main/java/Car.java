
public class Car implements IMove, IStop, IStart{

    private String make;
    private String model;
    private int odometerReading;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.odometerReading = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void move(int distance) {
        this.odometerReading += distance;
    }

    public String start() {
        return "Switch on the ignition.";
    }

    public String stop() {
        return "Apply the brakes.";
    }
}
