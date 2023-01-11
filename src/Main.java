import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.*;

import java.util.ArrayList;
import java.util.List;

import static Transport.Car.volumeEngine.*;

public class Main {
    public static void main(String[] args) throws RightsCheckException, WrongLoginException, WrongPasswordException {
        List<Transport> transports = new ArrayList<>();
        Car nisan = new Car("Nissan", "Almeria", G1_5);
        Bus volvo = new Bus("volvo", "3ge", 6.0);
        Track daf = new Track("DAF", "Trucks", 8.0);
        transports.add(nisan);
        transports.add(volvo);
        transports.add(daf);

        List<Driver> drivers = new ArrayList<>();
        DriverB<Car> ivan = new DriverB("Ivan", "21 ", 4, nisan);
        DriverC<Track> maks = new DriverC("Ivan", "Driver License B", 4, daf);
        DriverD<Bus> vlad = new DriverD("Ivan", "Driver License B", 4, volvo);
        drivers.add(ivan);
        drivers.add(maks);
        drivers.add(vlad);

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic<Car>("Alex", "volvoCompany", nisan));
        mechanics.add(new Mechanic<Bus>("Roma", "BMWMotorSport", volvo));
        mechanics.add(new Mechanic<Track>("Alex", "NissanGroup", daf));

        System.out.println(mechanics.get(2));
        System.out.println(drivers.get(2));
        System.out.println(transports.get(2));


    }
}
