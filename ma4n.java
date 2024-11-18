public class ma4n {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Недопустимое значение: " + number + ". Корень из отрицательного числа не может быть вычислен.");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            double result = calculateSquareRoot(25);
            System.out.println("Квадратный корень из 25: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double result = calculateSquareRoot(-9);
            System.out.println("Квадратный корень из -9: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}