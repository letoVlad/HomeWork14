package Transport;

public class Data {
    private static final String VALID_CHARACTERS = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXVZ_";

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            validCheck(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void validCheck(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Некорректный логин");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Некорректный пароль");
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Пароли не совпадают");
        }
    }

    private static boolean validate(String name) {
        if (name.length() > 20) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(name.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
