package Transport;

import Transport.Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " Остановился на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (120  - 150)) + 150)));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (100 - 150)) + 150)));
    }
}