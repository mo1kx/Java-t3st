public class ma17n {

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа не существует");
        }
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        double positiveNumber = 4.0;
        double negativeNumber = -1.0;

        try {
            double result = calculateSquareRoot(positiveNumber);
            System.out.println("Квадратный корень из " + positiveNumber + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            double resultWithNegative = calculateSquareRoot(negativeNumber);
            System.out.println("Квадратный корень из " + negativeNumber + " равен " + resultWithNegative);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}