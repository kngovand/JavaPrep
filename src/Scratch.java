import java.util.ArrayList;

public class Scratch {
    public static void main(String[] args) {
        int[] array = {15, 1, 50, 2};

        for (int i = 1; i < array.length ; i++) {
            int num = array[i];
            int previous = i-1;

            while(previous >= 0 && num < array[previous]) {
                int temp = array[previous + 1];
                array[previous + 1] = array[previous];
                array[previous] = temp;
                previous--;
            }
        }
        for (int num: array
             ) {
            System.out.println(num);
        }



/*        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }*/


    }
}
