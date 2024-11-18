public class ma7n {

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не должна быть отрицательной.");
        }
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        try {
            double base = 2;
            int exponent = 3;
            double result = calculatePower(base, exponent);
            System.out.println(base + " в степени " + exponent + " равно: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double base = 3;
            int exponent = -2;
            double result = calculatePower(base, exponent);
            System.out.println(base + " в степени " + exponent + " равно: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}