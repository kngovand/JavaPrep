import com.sun.javafx.geom.BaseBounds;

import java.util.ArrayList;
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 6, 18, 50};
        for (int i = 0; i <array.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (int n: array) {
            System.out.println(n);
        }
    }

}
