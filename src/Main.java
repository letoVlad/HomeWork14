public class Main {
    public static void main(String[] args) {
        Car car = new Car(2.4, "Седан", 4, "х5x5хx555",
                2, "Передняя", "Honda", "Accord", "Россия", "Белый", 2015, 240);
        car.info();
        Bus honda = new Bus("Honda", "Stepwgn Spada", "Japan", "White", 2012, 200);
        Bus maz = new Bus("Маз", "Маз-1242", "Беларусь", "Black", 2000, 160);
        Bus volvo = new Bus("Volvo", "9500", "Швеция", "White", 2020, 220);
        honda.info();
        maz.info();
        volvo.info();
    }
}