import java.security.SecureRandom;

public class Main {

    /**
     * 1000万のIDに対して、ランダムに1000万回数値を加算する
     * 配列版 4000ms
     * @param args
     */
    public static void main(String[] args) {
        SecureRandom sc = new SecureRandom();
        int max;
        //max = Integer.MAX_VALUE /2;
        int idNum = 10_000_000;
        max = 10_000_000;
        long startTime = System.currentTimeMillis();
        int[] count = new int[idNum];
        for (int i = 0; i < max; i++) {
            int id = sc.nextInt(idNum);
            count[id] += 1000;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total:" + (endTime - startTime) + "ms");
        //System.out.println(sc.nextInt(Integer.MAX_VALUE));

        for (int i = 0; i < 50; i++) {
            System.out.println(count[i]);
        }
    }
}
