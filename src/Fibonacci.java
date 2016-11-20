import acm.program.ConsoleProgram;

public class Fibonacci extends ConsoleProgram {
    public void run() {
        int nth = readInt("enter a number: ");
        int last = 0;
        int current = 1;
        for (int i = 1; i < nth; i++) {
            int tmpLast = last;
            last = current;
            current = tmpLast + current;
            println("current: " + current);
            println("last: " + last);
        }
        if (nth > 0) {
            println(current);
        } else {
            println("Error");
        }
    }
}
