package date20200411;

public class QuickSortWrite {

    public static void quickSort(int[] array) {
        int len;
        if (array == null || (len = array.length) == 0) {
            return;
        }

        sort(array, 0, len - 1);
    }

    private static void sort(int[] array, int left, int right) {


        if (left > right) {
            return;
        }

        int base = array[left];
        int i = left;
        int j = right;

        while (i != j) {
            //从右向左  5, 2, 1, 5, 3, 5, 6, 2, (4), 7
            // base = 5
            // j =7 j=4
            while (array[j] >= base && i < j) {
                j--;
            }
            //从左向右 i(5), i(2), 1, 5, 3, 5, lastI(6), 2, j(4), 7
            // base = 5
            // i = 5 i = 2 .... i = 6
            while (array[i] <= base && i < j) {
                i++;
            }

            //交换left和right
            // 5, 2, 1, 5, 3, 5, i(4), 2, 6 , 7
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //交换基数
        // 4, 2, 1, 5, 3, 5, i(5), 2, 6 , 7
        array[left] = array[i];
        array[i] = base;

        //递归
        sort(array, left, i - 1);  // 4, 2, 1, 5, 3, 5,
        sort(array, i + 1, right);  // 2, 6, 7
    }


}
