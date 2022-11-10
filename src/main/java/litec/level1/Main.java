package litec.level1;

import litec.NumberFileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static String OUT_DIR = "C:/temp";

    private final static int inputs = 1;

    private final static String test = "99 1 2 3";

    public static void main(String[] args) throws IOException {
        output(process(new NumberFileReader(new Scanner(test))), 99);

        for (int i=1; i<=inputs; i++) {
            output(process(NumberFileReader.fromResources(Main.class, "input." + i)), i);
        }
    }

    public static int[] process(NumberFileReader numberFileReader) {
        int result = 0;

        int[] values = numberFileReader.readIntArray();

        return values;
    }

    public static void output(int[] values, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int num : values) {
            sb.append(num).append(" ");
        }
        String s = sb.toString().trim();

        System.out.println("output " + i + ": " + s);

        try (FileWriter fileWriter = new FileWriter(OUT_DIR + "/output." + i + ".txt")) {
            fileWriter.write(s);
        }
    }
}
