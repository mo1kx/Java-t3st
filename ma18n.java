public class ma18n {
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля недопустима.");
        }
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        double validCelsius = 25.0;
        double invalidCelsius = -30.0;

        try {
            double fahrenheit = celsiusToFahrenheit(validCelsius);
            System.out.println(validCelsius + "°C = " + fahrenheit + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            double fahrenheitInvalid = celsiusToFahrenheit(invalidCelsius);
            System.out.println(invalidCelsius + "°C = " + fahrenheitInvalid + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}