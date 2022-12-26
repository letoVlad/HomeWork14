public class Main {
    public static void main(String[] args) {
        Car nisan = new Car("Nissan", "Almeria", 2.5);
        Bus volvo = new Bus("volvo", "3ge", 6.0);
        Track daf = new Track("DAF", "Trucks", 8.0);
        DriverLicenseB driverLicenseB = new DriverLicenseB();
        DriverLicenseС driverLicenseC = new DriverLicenseС();
        DriverLicenseD driverLicenseD = new DriverLicenseD();

        Driver<Car, DriverLicenseB> vlad = new Driver<>("Vladislav", driverLicenseB, 4, nisan);
        Driver<Bus, DriverLicenseС> ivan = new Driver<>("ivan", driverLicenseC, 5, volvo);
        Driver<Track, DriverLicenseD> denis = new Driver<>("denis", driverLicenseD, 6, daf);
        vlad.info();
        ivan.info();
        denis.info();


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
