import acm.program.ConsoleProgram;

public class TemperatureConverter extends ConsoleProgram {
    public void run() {
        int mode = readInt("Mode: ");
        while (true) {
            double inputTemp = readDouble("Temperature: ");
            if (inputTemp == -1000) {
                break;
            }
            if (mode == 1) {
                println(celsiusToFahrenheit(inputTemp));
            } else if (mode == 2) {
                println(fahrenheitToCelsius(inputTemp));
            }
        }
        println("Goodbye!");

    }
    public double celsiusToFahrenheit(double celsius) {
        return celsius * (9/5.0) + 32;

    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (5.0/9)*(fahrenheit - 32);
    }
}
