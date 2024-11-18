public class ma16n {

    public static int calculateRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return dividend % divisor;
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        try {
            int remainder = calculateRemainder(dividend, divisor);
            System.out.println("Остаток от деления " + dividend + " на " + divisor + " равен " + remainder);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        int divisorZero = 0;

        try {
            int remainderWithZeroDivisor = calculateRemainder(dividend, divisorZero);
            System.out.println("Остаток от деления " + dividend + " на " + divisorZero + " равен " + remainderWithZeroDivisor);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}