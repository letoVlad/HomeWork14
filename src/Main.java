import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.*;

import java.util.*;

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

        Set<Driver> drivers = new HashSet<>();
        DriverB<Car> ivan = new DriverB("Ivan", "Driver License B", 4, nisan);
        DriverC<Track> maks = new DriverC("maks", "Driver License C", 2, daf);
        DriverD<Bus> vlad = new DriverD("vlad", "Driver License A", 3, volvo);
        DriverD<Bus> dima = new DriverD("dima", "Driver License B", 4, volvo);

        drivers.add(ivan);
        drivers.add(maks);
        drivers.add(vlad);
        drivers.add(vlad);
        drivers.add(dima);
        drivers.add(dima);
        Iterator<Driver> iterator = drivers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
