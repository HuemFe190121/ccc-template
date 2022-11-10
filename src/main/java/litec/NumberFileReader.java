package litec;

import java.io.InputStream;
import java.util.Scanner;

public class NumberFileReader {
    public static NumberFileReader fromResources(Class<?> c, String fileName) {
        return new NumberFileReader(c.getResourceAsStream(fileName));
    }

    private final Scanner scanner;

    public NumberFileReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public NumberFileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt() {
        return Integer.parseInt(scanner.next());
    }

    public double readDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public int[] readIntArray() {
        String line = readLine();
        String[] rawInts = line.split(" ");
        int[] ints = new int[rawInts.length];
        for (int i=0; i<rawInts.length; i++) {
            ints[i] = Integer.parseInt(rawInts[i]);
        }
        return ints;
    }

    public double[] readDoubleArray() {
        String line = readLine();
        String[] rawDoubles = line.split(" ");
        double[] doubles = new double[rawDoubles.length];
        for (int i=0; i<rawDoubles.length; i++) {
            doubles[i] = Double.parseDouble(rawDoubles[i]);
        }
        return doubles;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
