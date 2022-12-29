package Transport;

public class Bus extends Transport {
    private Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println(getCapacity());
        }
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " Остановился на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (120 - 150)) + 150)));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (100 - 150)) + 150)));

    }

    public enum Capacity {
        ESPECIALLY_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private Integer minCapacity;
        private Integer maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            if (minCapacity == null) {
                return "Вместимость: " +
                        "до " + maxCapacity + " мест";
            } else if (maxCapacity == null) {
                return "Вместимость:" +
                        " от " + minCapacity + " мест";
            } else {
                return "Вместимость: " + minCapacity +
                        " - " + maxCapacity + " мест";
            }
        }
    }
}