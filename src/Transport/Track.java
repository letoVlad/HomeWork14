package Transport;

public class Track extends Transport {
    private LoadCapacity loadCapacity;

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Track(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " Остановился на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (90 - 120)) + 120)));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " = " + Integer.valueOf((int) ((Math.random() * (150 - 200)) + 200)));
    }

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);


        private Float minCapacity;
        private Float maxCapacity;
        private float capacity;

        LoadCapacity(Float minCapacity, Float maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;

        }
//Поиск значения в enum
        public static LoadCapacity correctCapacity(int capacity) {
            for (LoadCapacity value : values()) {
                if (capacity < 3.5) {
                    return N1;
                } else if (capacity > 3.5 && capacity < 12) {
                    return N2;
                } else {
                    return N3;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            if (minCapacity == null){
                return "Грузоподъемность:"  +
                        " до " + maxCapacity + " тонн";
            } else if (maxCapacity == null){
                return "Грузоподъемность:"  +
                        " от " + minCapacity + " тонн";
            } else {
                return "Грузоподъемность: от " + minCapacity +
                        " тонн до " + maxCapacity + " тонн";
            }
        }
    }
}