/**
 * Created by alex on 07-Dec-16.
 */

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    static String sDate = LocalDate.now().toString().replace("-",""); //сьогоднішній день
    //    від поточного часу віднімаю хвилину
    final static String sTime = LocalTime.now().minus(60, ChronoUnit.SECONDS).toString().substring(0,4);  //поточний час - цієї хвилини
    final private static Path path = Paths.get("\\\\F7\\Logs\\" + sDate + ".log");
    public String fileName = String.valueOf(path);

    public static void main(String[] args) throws IOException, ParseException {
       String fileName = String.valueOf(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        File file = new File(fileName);
//        FileReader reader = new FileReader(new File(fileName));
        Scanner inputfile = new Scanner(fileName).useDelimiter("\\n"); //   .useDelimiter("\\n*")
        int count;

        List<String> list = Files.readAllLines(Paths.get(fileName),
                Charset.defaultCharset() );



        count = NumRows.NumRowsTime(fileName, sTime);
        if (count > 0){
        List<String[]> a = new ArrayList<>();
        int i = 0, t = 0;
        while (inputfile.hasNextLine()) {

            String data_row = inputfile.nextLine();
            String[] data = data_row.split(",");
            if (data_row.contains(sTime)){
                a.add(data);
                System.out.println(data_row);

            }
        }
        inputfile.close();
        System.out.println(sTime);
        String[][] myArray = new String[a.size()][9];
        final String[][] strings = a.toArray(myArray);
        System.out.println(strings[1][1]);
//        System.out.println(((Object[]) ((ArrayList) a).elementData)[0][1]);
    }
    }


}
