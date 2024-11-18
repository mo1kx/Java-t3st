public class ma19n {

    public static void validateString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не должна быть пустой или равной null.");
        }
        System.out.println("Строка валидна: " + str);
    }
    public static void main(String[] args) {
        String validString = "Добрый день!";
        String emptyString = "";
        String nullString = null;

        try {
            validateString(validString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            validateString(emptyString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}