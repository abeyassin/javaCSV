import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PortReader {
    public static void main(String[] args) {
        String pathToCsv = "Yassin PortScan JAVA.csv"; // replace with your CSV file path
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(pathToCsv))) {

            while ((line = br.readLine()) != null) {
                // Use comma as separator
                String[] columns = line.split(",");

                // Print the content on the console
                //for (String column : columns) {
                    System.out.print(columns [4]+ " " + columns[10]);
                //}
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


