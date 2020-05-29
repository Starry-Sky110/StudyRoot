package date20200411;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        int[] i = {3, 5, 1, 3, 5, 4, 5, 6, 7, 2, 10};
        // 1 2 (3) 3 5 4 5 6 7 5 10
        // 1 2 3 3 (5) 4 5 6 7 5 10
        // 1 2 3 3 4 (5) 5 6 7 5 10
        // 1 2 3 3 4 5 5 (6) 7 5 10
        // 1 2 3 3 4 5 5 5 6 7 10

//        QuickSortTest.quickSort(i);
//        QuickSortWrite.quickSort(i);
//
//
//        for (int m = 0; m < i.length; m++) {
//            System.out.print(i[m] + " ");
//        }

//        List<Car>[] cars = new LinkedList[3];
//        List<Car> carList = new LinkedList<>();
//        for (int i = 0; i < 3; i++) {
//            carList.add(new Car(String.valueOf(i)));
//        }
//
//        Car[] cars = new Car[3];
//
//        for (int j = 0 ; j<3;j++){
//            cars[j] = new Car(String.valueOf(j));
//        }
//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }

//        int[][] ii = new int[3][3];
//        int[][] bb = {};
//
//        List<List> cc = new LinkedList<>();

        //base = 5
        // 右向左
        int[] i = {3, 2, 1, 3, 5, 6, 5, 5, 4, 7};
        // 5, 2, 1, 3, 5, 6, 5, 5, 4, 7
        // 2, 5, 1, 3, 5, 6, 5, 5, 4, 7 i=0
        // 1, 5, 2, 3, 5, 6, 5, 5, 4, 7 i=0
        // 1, 2, 5, 3, 5, 6, 5, 5, 4, 7 i=1
        // 1, 2, 3, 5, 5, 6, 5, 5, 4, 7 i=2
        // 1, 2, 3, 4, 5, 6, 5, 5, 5, 7 i=3
        // 1, 2, 3, 4, 5, 6, 5, 5, 5, 7 i=4
        // 1, 2, 3, 4, 5, 5, 6, 5, 5, 7 i=5
        // 1, 2, 3, 4, 5, 5, 5, 6, 5, 7 i=6
        // 1, 2, 3, 4, 5, 5, 5, 5, 6, 7 i=7
        // 1, 2, 3, 4, 5, 5, 5, 5, 6, 7 i=8
        // 1, 2, 3, 4, 5, 5, 5, 5, 6, 7 i=9
//        QuickSortWrite.quickSort(i);
//        BubbleSort.bubbleSort(i);
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(i);
//        for (int m : i) {
//            System.out.print(m + " ");
//        }
//        String str = "asdadas";

//        List<String> list = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i + "");
//        }
//        List<String> list2 = DeepCopy.deepCopy(list);
////        List<String> list2 = new LinkedList<>();
////        list2.addAll(list);
//
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(i + " : " + list2.get(i).hashCode());
//            System.out.println(i + " : " + list.get(i).hashCode());
//            System.out.println("-------------------------------");
//        }

        Car car = new Car();
        Car2 car2 = new Car2();
        System.out.println(car==car2);

    }
}
