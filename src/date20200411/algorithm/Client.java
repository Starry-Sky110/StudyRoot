package date20200411.algorithm;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Client {

    public static void main(String[] args) {
//        String str = "123456789";
//        String rts = StringChange.headTailExchange(str);
//        System.out.println(rts);

//        System.out.println(Steps.ways(7));


//        int i = 3 + 5;
//        String s = "123456789";
//
//        System.out.print(s.substring(1,3));
//
//        CallHowManyDays callHowManyDays = new CallHowManyDays();
//        callHowManyDays.CallHowManyDays();


        String path = "E:\\java\\interview\\test.txt";
        File file = new File(path);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(inputStreamReader);
            String line = "";
            line = br.readLine();
            Map<String, Integer> map = new HashMap<>();
            while (line != null) {
//                line = line.replaceAll("[^a-zA-Z]", "");
                String[] split = line.split(",");
                for (String s : split) {
                    s = s.replaceAll("[^a-zA-Z]", "");
                    if (!map.containsKey(s)) {
                        map.put(s, 1);
                    } else {
                        map.put(s, map.get(s) + 1);
                    }

                }
                line = br.readLine();
            }
            map.remove("");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

