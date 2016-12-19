/**
 * Created by alex on 30-Nov-16.
 */

//package javaapplication1;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class GrafKotel {
    static String sDate = LocalDate.now().toString().replace("-",""); //сьогоднішній день
    final static String sTime = LocalTime.now().toString().substring(0,6);  //поточний час - цієї хвилини
    final private static Path path = Paths.get("\\\\F7\\Logs\\" + sDate + ".log");

    public static void main(String[] args) throws IOException  {
        String fileName = String.valueOf(path);

        XYSeries series = new XYSeries("Kotel");


        double[][] rents = {{400, 550, 600},
                {500, 525, 640},
                {475, 425, 750},
                {625, 490, 510}};

        String[][] aaa = readUsingBufferedReaderToArray(fileName);
//        final DefaultCategoryDataset dataset =
//                new DefaultCategoryDataset( );
//        for(int i = 0; i < aaa.length; i++){
//            dataset.addValue( aaa );
////            series.add(i, rents[i][0]);
////            series.add(row, numbers[row][3]);
//        }
        for(int row = 0;row < aaa.length; row++)
        {
            for(int col = 0; col < aaa[0].length; col++)
            {
                series.add(row, Integer.parseInt(aaa[row][3]));
            }
            System.out.println();
        }



        XYDataset xyDataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory
                .createXYLineChart("Kotel Temp", "x", "y",
                        xyDataset,
                        PlotOrientation.VERTICAL,
                        true, true, true);
        JFrame frame =
                new JFrame("MinimalStaticChart");
        // Помещаем график на фрейм
        frame.getContentPane()
                .add(new ChartPanel(chart));
        frame.setSize(400,300);
        frame.show();
    }


    private static String[][] readUsingBufferedReaderToArray(String fileName) throws IOException {
        int nRow = 4; //вибираю лише чотири рядки
        int nCol = 9; // у мене 9 колонок
        String[][] numbers = new String[nRow][nCol];
        BufferedReader bufRdr = new BufferedReader(new FileReader(fileName));
        String line = null;
        int row = 0;
        int col = 0;
        //read each line of text file
// Split ExampleSplit ExampleSplit ExampleSplit ExampleSplit ExampleSplit Example
        System.out.println("\n\nSplit Example: \n");
        String delims = ",";
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );


        while ((line = bufRdr.readLine()) != null  && row < nRow) {
            String[] tokens = line.split(delims);
//            int tokenCount = tokens.length;
//            for (int j = 0; j < tokenCount; j++) {
            for ( col = 0; col < 9; col++) {
//                System.out.println("Split Output: " + tokens[j]);
                String numbers1 = tokens[col];
//                dataset.addValue(numbers1);
            }
            row++;
        }
// Split ExampleSplit ExampleSplit ExampleSplit ExampleSplit ExampleSplit Example

        while ((line = bufRdr.readLine()) != null && row < nRow) {
            StringTokenizer st = new StringTokenizer(line, ",");
//            IntegerTokenizer st = new StringTokenizer(line, ",");
            while (st.hasMoreTokens()) {
                //get next token and store it in the array
                numbers[row][col] = st.nextToken();
                col++;
            }
            row++;
            col = 0;

        }
        //close the file
        bufRdr.close();
        return numbers;

    }
}
