package Transport;

public class Mechanic<T extends Transport> {
    private String FIO;
    private String company;
    private T transport;

    void maintenance() {
        System.out.println(FIO + " Провел техобслуживание");
    }

    void fixCar() {
        System.out.println(FIO + " Починил машину");
    }

    public Mechanic(String FIO, String company, T transport) {
        this.FIO = FIO;
        this.company = company;
        this.transport = transport;
    }

    public Mechanic(String FIO, String company) {
        this.FIO = FIO;
        this.company = company;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "FIO='" + FIO + '\'' +
                ", company='" + company + '\'' +
                ", ремонитирует= " + transport.getBrand() + '\'' +
                '}';
    }
}
