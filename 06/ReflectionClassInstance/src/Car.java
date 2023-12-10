public class Car {
    private String brand, model;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    private Car(String model) {
        this.brand = "Simple Car";
        this.model = model;
    }

    public String getBrand() { return brand; }
    private String getModel() { return model; }

    public void setBrand(String brand) { this.brand = brand; }
    private void setModel(String model) { this.model = model; }

}

