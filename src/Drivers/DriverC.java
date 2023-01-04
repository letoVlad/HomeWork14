package Drivers;

import Drivers.Driver;
import Transport.Bus;
import Transport.Car;
import Transport.RightsCheckException;
import Transport.Track;

public class DriverC<T extends Track> extends Driver {
    public DriverC(String fio, String driverLicense, int experience, T vehicle) throws RightsCheckException {
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
