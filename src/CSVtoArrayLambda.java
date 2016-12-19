import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/** Created by alex on 09-Dec-16. */
public class CSVtoArrayLambda {
//        static Calendar now = Calendar.getInstance();
    static String sDate = LocalDate.now().toString().replace("-",""); //сьогоднішній день
    final static String sTime = LocalTime.now().minus(60, ChronoUnit.SECONDS).toString().substring(0,6);  //поточний час
    // - попередньої хвилини, інколи немає ще даних на поточну хвилину
    final private static Path path = Paths.get("\\\\F7\\Logs\\" + sDate + ".log");

    public static void main(String[] args) {

        BufferedReader Buffer = null;

        try {
            Stream<String> lines2 = Files.lines(path);
            List<String> resultList = lines2
                    .filter(listString ->
                            (listString.substring(15,16).contains("5"))
                                    && listString.substring(17,18).matches("[012]") )
                    .collect(Collectors.toList());

            Function<String, String> sData = (value) -> value.substring(0,10)+ " 100000 ";

            resultList.forEach(value -> System.out.println(sData.apply(value)));
            System.out.println(resultList.size());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Buffer != null) Buffer.close();
            } catch (IOException Exception) {
                Exception.printStackTrace();
            }
        }
    }



    }


