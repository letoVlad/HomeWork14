package Drivers;

import Transport.Bus;
import Transport.RightsCheckException;

public class DriverD<T extends Bus> extends Driver {
    public DriverD(String fio, String driverLicense, int experience, T vehicle) throws RightsCheckException {
        super(fio, driverLicense, experience, vehicle);
    }
    void startMoving() {
        System.out.println(getFio() + " с правами категорие D начал движение.");
    }

    void stopMoving() {
        System.out.println(getFio() + " с правами категорие D остановился");
    }

    void refuelTheCar() {
        System.out.println(getFio() + " с правами категорие D заправляет авто");
    }

}
