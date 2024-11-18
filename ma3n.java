public class ma3n {
    public static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Недопустимый возраст: " + age + ". Возраст должен быть в диапазоне от 0 до 150.");
        }
        System.out.println("Возраст " + age + " является допустимым.");
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateAge(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}