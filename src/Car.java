
import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private final String transmission;
    private final String body;
    private String registrationNumber;
    private final int numberOfSeats;
    private int summerTires;

    public Car(double engineVolume, String body, int numberOfSeats, String registrationNumber, int summerTires, String transmission, String brand, String model, String country, String color, int yearOfManufacture, int maximumSpeed) {
        super(brand, model, country, color, yearOfManufacture, maximumSpeed);
        this.body = body;
        this.numberOfSeats = numberOfSeats;

        if (registrationNumberCheck(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Номер не правильный";
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = " Некорректное значение";
        }
    }


    //Проверка регистрационного номера
    boolean registrationNumberCheck(String registrationNumber) {
        char[] number = registrationNumber.toCharArray();
        if (Character.isDigit(number[1]) && Character.isDigit(number[2]) && Character.isDigit(number[3])
                && Character.isDigit(number[6]) && Character.isDigit(number[7]) && Character.isDigit(number[8])) {
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Марка " + getBrand() + "" +
                ", модель " + getModel() +
                ", сборвка в " + getCountry() +
                ", цвет кузова - " + getColor() +
                ", объем двигателя " + engineVolume +
                ", год выпуска " + getYearOfManufacture() + " год" +
                ", регистрационный номер " + registrationNumber +
                ", тип кузова " + body +
                ", колличество мест " + numberOfSeats +
                ", трансмиссия " + transmission +
                ", максимальная скорость" + getYearOfManufacture());
    }

    public static class KeyCar {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public KeyCar(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class Insurance {
        final private LocalDate validity;
        final private int price;
        final private int number;

        public Insurance(int year, int mouth, int dayOfMouth, int price, int number) {
            if (!LocalDate.of(year, mouth, dayOfMouth).isAfter(LocalDate.now())) {
                System.out.println("Страховку надо продлить!");
            }
            if (String.valueOf(number).length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
            this.validity = LocalDate.of(year, mouth, dayOfMouth);
            this.price = price;
            this.number = number;
        }

        public void info() {
            System.out.println("Срок действия страховки - " + validity +
                    ", Стоимость страховки- " + price +
                    ", Номер страховки- " + number);
        }
    }
}

