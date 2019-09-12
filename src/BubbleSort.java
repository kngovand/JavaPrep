public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {150, 58, 80, 34, 15};

        bubbleSort(array);
        bubbleSortOptimized(array);
    }
    //Optimized by not allowing the sort to go past the last placed item on the right side
    private static void bubbleSortOptimized(int[] arr) {
        int lastIndex = arr.length - 1;

        while(lastIndex > 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        lastIndex--;
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println(": Bubble Sort Optimized");
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int n: arr) {
            System.out.print(n + " ");
        }

        System.out.println(": Bubble Sort");
    }
}
