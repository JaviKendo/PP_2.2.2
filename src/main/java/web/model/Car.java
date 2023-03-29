package web.model;

public class Car {
    private String make;
    private String model;
    private int generation;

    public Car() {
    }

    public Car(String make, String model, int generation) {
        this.make = make;
        this.model = model;
        this.generation = generation;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}