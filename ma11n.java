public class ma11n {

    public static boolean isDivisible(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return dividend % divisor == 0;
    }

    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 2;
            boolean result = isDivisible(dividend, divisor);
            System.out.println(dividend + " делится на " + divisor + ": " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int dividend = 10;
            int divisor = 0;
            boolean result = isDivisible(dividend, divisor);
            System.out.println(dividend + " делится на " + divisor + ": " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}