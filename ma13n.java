public class ma13n {

    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль маленький. Он должен содержать не менее 8 символов.");
        }

    }

    public static void main(String[] args) {
        String password = "12345";

        try {
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}