import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by alex on 07-Dec-16.
 */
public class  Main {
    public static void main(String[] args) throws IOException, ParseException {
        ReadCSV1 readCSV1 = new ReadCSV1();
//        Scanner inputfile = new Scanner();
        Scanner inputfile = readCSV1.ScanData();
    }
}
