public class ma5n {

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Недопустимое значение: " + number + ". Факториал отрицательного числа не может быть вычислен.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        try {
            int number = 5;
            long result = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            int number = -3;
            long result = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}