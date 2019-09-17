import com.sun.javafx.geom.BaseBounds;

import java.util.ArrayList;
//  TO COMPLETE
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 6, 18, 50};
        selection(array);
    }

    public static int[] selection(int[] array) {
        int min = 0, index = 0;
        min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min) {
                min = array[i];
                System.out.println(min);
            }
        }
        System.out.println(min);
        return array;
    }

}
