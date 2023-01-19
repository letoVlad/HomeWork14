import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        HashMap<Transport, Mechanic> mechanics = new HashMap<>();
        mechanics.put(nisan, new Mechanic<Car>("Alex", "volvoCompany", nisan));
        mechanics.put(volvo, new Mechanic<Bus>("Roma", "BMWMotorSport", volvo));
        mechanics.put(daf, new Mechanic<Track>("Alex", "NissanGroup", daf));
        for (Map.Entry<Transport, Mechanic> info: mechanics.entrySet()){
            System.out.println("Имя механика: " + info.getValue().getFIO() + " Ремонтируемый трансопрт: " + info.getKey().getBrand());
        }




    }
}
