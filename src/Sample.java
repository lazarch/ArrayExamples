/**
 * Created by alex on 07-Dec-16.
 */
/**
 * Created by alex on 07-Dec-16.
 */
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

class Sample {

    public static void main(String args[]) {
        System.out.print("(X,Y) Paired Values");
        int row =4;
        double[][] sample = new double[row][2];

        for (int g = 0; g < 4; g++) {  //g < sampe.length
            for (int h = 0; h < 2; h++) {
                System.out.print("" + sample[g][h] + " , ");
            }
        }
//        MultiDimensional sample = new MultiDimensional("Demo", sample);
    }

    static XYDataset samplexydataset2(double[][] sample) {
        XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
        XYSeries series = new XYSeries("DataSet");
        for (int x = 0; x < sample.length; x++) {
            series.add(sample[x][0], sample[x][1]);
        }
        xySeriesCollection.addSeries(series);
        return xySeriesCollection;
    }
}
