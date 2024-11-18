import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ma14n {

    public static void validateDate(String dateStr) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);

        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Некорректный формат даты. Ожидается формат dd.MM.yyyy", dateStr, e.getErrorIndex(), e);
        }
    }

    public static void main(String[] args) {
        String dateStr = "31.12.2023";

        try {
            validateDate(dateStr);
            System.out.println("Дата корректна: " + dateStr);
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }

        String invalidDateStr = "31.13.2023";
        try {
            validateDate(invalidDateStr);
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());

        }
    }
}