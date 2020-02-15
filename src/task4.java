//4*. Написать рекурсивный(!!!) метод который выводит все перестановки строки.
//        Например для строки abc: abc, acb, bac, bca, cab, cba

import java.util.ArrayList;
import java.util.List;

public class task4 {

    public static void main(String[] args) {
        String s = "abc";
        printAnagrams("", s);
    }

    static void printAnagrams(String prefix, String s) {
        if (s.length() <= 1) {
            System.out.println(prefix + s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String current = s.substring(i, i + 1);
                String prev = s.substring(0, i); // letters before cur
                String next = s.substring(i + 1); // letters after cur
                printAnagrams(prefix + current, prev + next);
            }
        }
    }


}

