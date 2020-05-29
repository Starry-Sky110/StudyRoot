package date20200411;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        int len;
        if (array == null || (len = array.length) == 0) {
            return;
        }

        sort(array);
    }

    private static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            for (int m = 0; m < array.length; m++) {
                for (int n = m; n < array.length; n++) {
                    if (array[m] > array[n]) {
                        int temp = array[m];
                        array[m] = array[n];
                        array[n] = temp;
                    }
                }

//            for (int m : array) {
//                System.out.print(" " + m + " ");
//            }
//            System.out.print("i= " + i);
//            System.out.println();
            }
        }
    }
}
