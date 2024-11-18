public class ma9n {

    public static int findElement(int[] array, int element) {

        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null.");
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }


        throw new IllegalArgumentException("Элемент " + element + " не найден в массиве.");
    }

    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            int elementToFind = 3;
            int index = findElement(array, elementToFind);
            System.out.println("Элемент " + elementToFind + " найден на индексе: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] array = {1, 2, 3, 4, 5};
            int elementToFind = 6;
            int index = findElement(array, elementToFind);
            System.out.println("Элемент " + elementToFind + " найден на индексе: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] nullArray = null;
            int elementToFind = 3;
            int index = findElement(nullArray, elementToFind);
            System.out.println("Элемент " + elementToFind + " найден на индексе: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}