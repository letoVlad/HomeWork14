package Drivers;
import Transport.Bus;
import Transport.Car;
import Transport.RightsCheckException;
import Transport.Track;

public class DriverB<T extends Car> extends Driver {
    public DriverB(String fio, String driverLicense, int experience, T vehicle) throws RightsCheckException {
        super(fio, driverLicense, experience, vehicle);

    }

    void startMoving() {
        System.out.println(getFio() + " с правами категорие В начал движение.");
    }

    void stopMoving() {
        System.out.println(getFio() + " с правами категорие В остановился");
    }

    void refuelTheCar() {
        System.out.println(getFio() + " с правами категорие В заправляет авто");
    }
}
