import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    /**
     * 1000万のIDに対して、ランダムに1000万回数値を加算する
     * HashMap版 35000ms
     * @param args
     */
    public static void main(String[] args) {
        SecureRandom sc = new SecureRandom();
        int max;
        //max = Integer.MAX_VALUE /2;
        int idNum = 10_000_000;
        max = 10_000_000;
        long startTime = System.currentTimeMillis();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < max; i++) {
            int id = sc.nextInt(idNum);
            int sum = map.getOrDefault(id,0);
            map.put(id,sum + 1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total:" + (endTime - startTime) + "ms");
        //System.out.println(sc.nextInt(Integer.MAX_VALUE));

        for (int i = 0; i < 50; i++) {
            System.out.println(map.getOrDefault(i,0));
        }
    }
}
