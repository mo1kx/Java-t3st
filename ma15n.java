public class ma15n {

    public static String combineStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("NullPointerException.");
        }
        return str1 + str2;
    }

    public static void main(String[] args) {
        String string1 = "Добрый ";
        String string2 = "День!";

        try {
            String result = combineStrings(string1, string2);
            System.out.println("Результат объединения: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        String string3 = null;
        try {
            String resultWithNull = combineStrings(string1, string3);
            System.out.println("Результат объединения: " + resultWithNull);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}