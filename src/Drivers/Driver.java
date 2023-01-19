package Drivers;

import Transport.*;

import java.util.Objects;

public class Driver<T extends Transport> {
    private String fio;
    private String driverLicense;
    private int experience;
    private T vehicle;

    public Driver(String fio, String driverLicense, int experience, T vehicle) throws RightsCheckException {
        this.fio = fio;
        if (driverLicense != null && !driverLicense.isEmpty() && !driverLicense.isBlank() ) {
            this.driverLicense = driverLicense;
        } else {
            throw new RightsCheckException("ПРАВА не указаны ");
        }
        this.experience = experience;
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fio, driver.fio)
                && Objects.equals(driverLicense, driver.driverLicense)
                && Objects.equals(vehicle, driver.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, driverLicense, experience, vehicle);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    void startMoving() {
        System.out.println(getFio() + " начал движение.");
    }

    void stopMoving() {
        System.out.println(getFio() + " остановился");
    }

    void refuelTheCar() {
        System.out.println(getFio() + " заправляет авто");
    }

    @Override
    public String toString() {
        return "Водитель{" +
                "ФИО='" + fio + '\'' +
                ", Лицензия=" + driverLicense +
                ", Опыт=" + experience +
                '}';
    }

    public void info() {
        System.out.println("Водитель " + getFio() + " управляет " + vehicle.getBrand() + " и будет участвовать в заезде");
    }
}
