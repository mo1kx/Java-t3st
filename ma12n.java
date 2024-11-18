import java.util.List;

public class ma12n{

    public static <T> T getElementByIndex(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException.");
        }
        return list.get(index);
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(10, 20, 30, 40, 50);

        try {
            System.out.println(getElementByIndex(myList, 2)); // Вывод: 30
            System.out.println(getElementByIndex(myList, 5)); // Вызывает исключение
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}