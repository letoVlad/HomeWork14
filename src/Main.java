public class Main {
    public static void main(String[] args) {
        Car nisan = new Car("Nissan", "Almera",2.5);
        Bus volvo = new Bus("volvo", "3ge",6.0);
        Track daf = new Track("DAF", "Trucks",8.0);

        Driver<Car> vlad = new Driver<>("Vladislav", true, 4, nisan);
        Driver<Bus> ivan = new Driver<>("ivan", true, 5, volvo);
        Driver<Track> denis = new Driver<>("denis", true, 6, daf);
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
