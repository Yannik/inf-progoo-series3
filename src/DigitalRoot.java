import acm.program.ConsoleProgram;

public class DigitalRoot extends ConsoleProgram {
    public void run() {
        int number = readInt("Bitte gib eine Zahl ein: ");
        int dsum = 0;
        while (number > 0) {
            dsum += number % 10;
            number = number / 10;
            if (number <= 0 && dsum >= 10) {
                number = dsum;
                dsum = 0;
            }
        }

        if (dsum > 0) {
            println(dsum);
        } else {
            println("Error");
        }
    }
}
