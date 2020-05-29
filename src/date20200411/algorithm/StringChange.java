package date20200411.algorithm;

public class StringChange {

    public static String headTailExchange(String str) {
        if (null == str || str.equals("") || str.length() <= 1) {
            return str;
        }
        return headTailExchange(str.substring(1)) + str.charAt(0);
    }


}
