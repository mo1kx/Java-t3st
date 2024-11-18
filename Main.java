public class Main {

    public static int findMax(int a, int b) throws IllegalArgumentException {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны. Исключение: числа должны быть различными.");
        }
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(findMax(10, 20));
            System.out.println(findMax(5, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}