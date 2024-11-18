public class ma8n {

    public static String trimString(String input, int length) {
        if (input == null) {
            throw new IllegalArgumentException("Входная строка не должна быть null.");
        }
        if (length > input.length()) {
            throw new IllegalArgumentException("Число символов не может быть больше длины строки.");
        }
        return input.substring(0, length);
    }

    public static void main(String[] args) {
        try {
            String str = "Hello, World!";
            int length = 5;
            String trimmed = trimString(str, length);
            System.out.println("Обрезанная строка: " + trimmed);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            String str = "Hello, World!";
            int length = 20;
            String trimmed = trimString(str, length);
            System.out.println("Обрезанная строка: " + trimmed);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            String str = null;
            int length = 5;
            String trimmed = trimString(str, length);
            System.out.println("Обрезанная строка: " + trimmed);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}