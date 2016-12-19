/**
 * Created by alex on 07-Dec-16.
 */
/*
public class Zaxovav {
    //            System.out.println(lastLine);
    //    static Calendar now = Calendar.getInstance();
    static String sDate = LocalDate.now().toString().replace("-",""); //сьогоднішній день
    final static String sTime = LocalTime.now().toString().substring(0,6);  //поточний час - цієї хвилини
    final private static Path path = Paths.get("\\\\F7\\Logs\\" + sDate + ".log");

    Stream<String> lines = Files.lines(path);
    List<List<String>> values = lines
            .skip(1)
            .map(line -> Arrays.asList(line.split("\\s*,\\s*")))
            .filter(list -> list.get(0).equals(sTime)) // keep only items where the name is ""
            .collect(Collectors.toList());
            System.out.println(values);

    //===================================================
    List<List<String>> val = lines
            .map(line -> Arrays.asList(line.split("\\s*,\\s*")))
            .filter(list -> list.get(0).equals(sTime))
            .collect(Collectors.toList());
            System.out.println(val);
    //===================================================
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
            numbers.forEach(System.out::println);
    //===================================================
    List<String> stringList = new ArrayList<>();
            stringList.add("Кот");
            stringList.add("Пёс");
            stringList.add("Котопёс");

    List<String> resultList = stringList.stream()
            .filter(value -> value.startsWith("Кот"))
            .collect(Collectors.toList());
            resultList.forEach(value -> System.out.println(value));
//коротше те ж саме ==================================
            Arrays.asList("Кот", "Пёс", "Котопёс")
                    .stream() throws IOException
            .filter, IOException(v -> v.startsWith("Кот"))
            .forEach(System.out::println) throws IOException;
//або те ж саме ==================================

            Stream.of("Кот", "Пёс", "Котопёс")
                    .filter(v throws IOException -> v.startsWith("Кот"))
            .forEach(System.out::println) throws IOException;

//===================================================

}
*/
