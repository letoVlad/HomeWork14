package Transport;

public class Car extends Transport {
    private volumeEngine volume;

    public Car.volumeEngine getVolume() {
        return volume;
    }

    public void setVolume(volumeEngine volume) {
        this.volume = volume;
    }

    public Car(String brand, String model, volumeEngine volume) {
        super(brand, model, 0);
        this.volume = volume;
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " Остановился на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (60 - 90)) + 90)));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (200 - 250)) + 250)));
    }

    @Override
    public void printType() {
        System.out.println(getVolume());
    }

    public enum Body {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");

        private String translation;

        Body(String translation) {
            this.translation = translation;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + translation;
        }
    }

    public enum volumeEngine {
        G1_5(1.5), G2_0(2), G2_5(2.5), G3_0(3);
        private double volume;

        @Override
        public String toString() {
            return "Объем двигателя = " + volume;
        }

        volumeEngine(double volume) {
            this.volume = volume;
        }

    }
}



