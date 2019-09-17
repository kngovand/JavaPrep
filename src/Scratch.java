public class Scratch {
    public static void main(String[] args) {
        int[] array = {10,5,2,4};

        insertion(array);
        for (int n : array) {
            System.out.println(n);
        }

    }

    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length - 1 ; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertion(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int num = array[i];
            int previous = i-1;

            while(previous >=0 && num < array[previous]) {
                int temp = array[previous];
                array[previous] = array[previous+1];
                array[previous+1] = temp;
                previous--;
            }
        }
        return array;
    }
}
