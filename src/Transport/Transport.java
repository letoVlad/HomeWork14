package Transport;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private Transport transport;

    public Transport(String brand, String model, double engineVolume) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        this.engineVolume = engineVolume;
    }

   public abstract boolean getDiagnosed();

    void finishTheMove() {
        System.out.println(getBrand() + " Начинает движение.");
    }

    void startMoving() {
        System.out.println(getBrand() + " Заканчивает движение.");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract void printType();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", transport=" + transport +
                '}';
    }
}