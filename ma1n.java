public class ma1n {
    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 2);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}