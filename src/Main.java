import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.RightsCheckException;
import Transport.Track;
import static Transport.Car.volumeEngine.*;

public class Main {
    public static void main(String[] args) throws RightsCheckException {
        Car nisan = new Car("Nissan", "Almeria",G1_5);
        Bus volvo = new Bus("volvo", "3ge", 6.0);
        Track daf = new Track("DAF", "Trucks", 8.0);
        DriverB<Car> ivan = new DriverB("Ivan", "21 ", 4, nisan);
        DriverC<Track> maks = new DriverC("Ivan", "Driver License B", 4, daf);
        DriverD<Bus> vlad = new DriverD("Ivan", "Driver License B", 4, volvo);
        nisan.printType();

    }
}
