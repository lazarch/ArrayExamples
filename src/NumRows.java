import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by alex on 07-Dec-16.
 */
public class NumRows {
    public static int NumRows(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner inputfile = new Scanner(file);
        inputfile.next();
        inputfile.next();
        int count = 0;
        while (inputfile.hasNext()) {
            String data_row = inputfile.next();
            count++;
        }

        return count;


    }   public static int NumRowsTime(String fileName, String sTime) throws IOException {
        File file = new File(fileName);
        Scanner inputfile = new Scanner(file);
        inputfile.next();
        inputfile.next();
        int count = 0;
        while (inputfile.hasNext()) {
            String data_row = inputfile.next();
            if (data_row.contains(sTime))
            count++;
        }

        return count;
    }
}
