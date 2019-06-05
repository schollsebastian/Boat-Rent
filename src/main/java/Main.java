import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {
    static BootMgnt bootMgnt = new BootMgnt();

    public static void main(String[] args) {
        readCsv("boot.csv");
        bootMgnt.printBoot();
        writeCsv("file.csv");
    }

    public static void readCsv(String filename) {

        Path files = Paths.get(filename);

        try {
            List<String> lines = Files.readAllLines(files);

            for (int i = 1; i < lines.size(); i++) {
                String [] split = lines.get(i).split(";");
                String firstName = split[0];
                String lastName = split[1];
                int bootId = Integer.parseInt(split[2]);

                bootMgnt.rentBoot(bootId,firstName,lastName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BootBesetztExeption bootBesetztExeption) {
            bootBesetztExeption.printStackTrace();
        }
    }

    public static void writeCsv(String filename) {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filename))) {

            for (int i = 0; i < bootMgnt.getBoote().length; i++) {
                if (bootMgnt.getBoote()[i] != null) {
                    printWriter.append(bootMgnt.getBoote()[i].toString() + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}