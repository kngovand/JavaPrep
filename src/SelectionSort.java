import com.sun.javafx.geom.BaseBounds;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 3, 9, 6};

        for (int i = 1; i < arr.length ; i++) {
            int num = arr[i];
            int previous = i-1;

            while(previous >= 0 && num < arr[previous]) {
                int temp = arr[previous];
                arr[previous] = arr[previous + 1];
                arr[previous + 1] = temp;
                previous--;
            }
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }

    }

}
