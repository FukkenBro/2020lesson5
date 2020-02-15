import java.util.ArrayList;
import java.util.Random;


// 2. Написать метод который проверяет число простое или нет. Если нет вывести все его делители.

public class task2 {

    public static final Random RANDOM = new Random();

    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            int n = RANDOM.nextInt(10000);
            isPrime(n);
        }
    }

    static boolean isPrime(int n) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int i, m = 0;
        m = n / 2;
        boolean flag = true;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    tmp.add(i);
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println(n + " делится нацело на " + tmp.toString());
                return false;
            }
            System.out.println(n + " простоe число");
            return flag;
        }
    }

}
