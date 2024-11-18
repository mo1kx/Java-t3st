public class ma10n {

    public static String convertToBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным.");
        }

        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        try {
            int number = 10;
            String binaryString = convertToBinary(number);
            System.out.println("Двоичное представление числа " + number + ": " + binaryString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int number = -5;
            String binaryString = convertToBinary(number);
            System.out.println("Двоичное представление числа " + number + ": " + binaryString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}