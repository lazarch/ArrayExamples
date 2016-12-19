import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadFile {
    static String sDate = LocalDate.now().toString().replace("-",""); //сьогоднішній день
//    від поточного часу віднімаю хвилину
    final static String sTime = LocalTime.now().minus(60, ChronoUnit.SECONDS).toString().substring(0,5);  //поточний час - цієї хвилини
    final private static Path path = Paths.get("\\\\F7\\Logs\\" + sDate + ".log");
    public static String fileName = String.valueOf(path);

    public static void main(String[] args) {
        File f = new File(fileName);
        try{
            ArrayList<String> lines = get_arraylist_from_file(f);
            for(int x = 0; x < lines.size(); x++){
                System.out.println(lines.get(x) + "   " + sTime);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }







        System.out.println("done");
    }
    public static ArrayList<String> get_arraylist_from_file(File f)
            throws FileNotFoundException {
        Scanner s;
        ArrayList<String> list = new ArrayList<String>();
        s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().contains(sTime)){
//                final String s1 = s.nextLine();
//                System.out.println(s1 + "  1 " + sTime);
                list.add(s.nextLine());
//                System.out.println(s1 + "  2 " + sTime);
            }
        }
        s.close();
        return list;
    }
}