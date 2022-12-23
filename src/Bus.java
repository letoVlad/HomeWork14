
public class Bus extends Transport {
    public Bus(String brand, String model, String country, String color, int yearOfManufacture, int maximumSpeed) {
        super(brand, model, country, color, yearOfManufacture, maximumSpeed);
    }

    public void info() {
        System.out.println("Марка " + getBrand() + "" +
                ", модель " + getModel() +
                ", сборвка в " + getCountry() +
                ", цвет кузова - " + getColor() +
                ", год выпуска " + getYearOfManufacture() + " год" +
                ", максимальная скорость" + getYearOfManufacture());
    }
}