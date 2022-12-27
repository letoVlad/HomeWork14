import Drivers.*;
import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car nisan = new Car("Nissan", "Almeria", 2.5);
        Bus volvo = new Bus("volvo", "3ge", 6.0);
        Track daf = new Track("DAF", "Trucks", 8.0);
        DriverB<Car> ivan = new DriverB("Ivan", "Driver License B", 4, nisan);
        DriverC<Track> maks = new DriverC("Ivan", "Driver License B", 4, daf);
        DriverD<Bus> vlad = new DriverD("Ivan", "Driver License B", 4, volvo);


        ivan.info();


        System.out.println("-------------");
        nisan.bestLapTime();
        nisan.maxSpeed();
        System.out.println("-------------");
        volvo.bestLapTime();
        volvo.maxSpeed();
        System.out.println("-------------");
        daf.bestLapTime();
        daf.maxSpeed();

    }
}
