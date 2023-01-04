package Transport;

import Drivers.Driver;

public class RightsCheckException extends Exception {
    private Driver driver;

    public RightsCheckException(String message) {
        super(message);

    }

    public Driver getDriver() {
        return driver;
    }
}
