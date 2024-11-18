public class ma6n{

    public static void checkForZeros(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                throw new IllegalArgumentException("Массив содержит ноль на позиции " + i + ".");
            }
        }
        System.out.println("Массив не содержит нулей.");
    }

    public static void main(String[] args) {
        try {
            int[] validArray = {1, 2, 3, 4, 5};
            checkForZeros(validArray);

            int[] arrayWithZero = {1, 2, 0, 4, 5};
            checkForZeros(arrayWithZero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] nullArray = null;
            checkForZeros(nullArray);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}