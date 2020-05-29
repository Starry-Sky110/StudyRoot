package date20200411.algorithm;

public class Steps {

    public static Integer ways(Integer n) {
        //n级台阶，每一次可以走1或2或3，共有几种走法
        int count = 0;
        if (n == 1 || n == 2) {
            return n;
        } else if (n == 3) {
            return 4;
        } else {
            count = ways(n - 1) + ways(n - 2) + ways(n - 3);
        }
        return count;
    }
}
