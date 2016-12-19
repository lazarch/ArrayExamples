import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peggy Fisher
 */
public class MultiDimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int[][] rents = {{400, 550, 600},
            {500, 525, 640},
            {475, 425, 750},
            {625, 490, 510}};
        System.out.println("Jan \t Feb \t Mar");


        for(int row = 0;row < rents.length; row++)
        {
            for(int col = 0; col < rents[0].length; col++)
            {
                System.out.print("$" + rents[row][col]+"\t");
            }
            System.out.println();
        }
        List<Integer> list = new ArrayList<Integer>();
//        for(: rents) list.add(i);
        System.out.println(list);
    }





}
    

