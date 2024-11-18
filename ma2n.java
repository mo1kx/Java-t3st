public class ma2n {
    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Недопустимый формат числа: " + str);
        }
    }
    public static void main(String[] args) {
        String validNumber = "123";
        String invalidNumber = "фис";

        try {
            int result = convertStringToInt(validNumber);
            System.out.println("Конвертированное число: " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = convertStringToInt(invalidNumber);
            System.out.println("Конвертированное число: " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}