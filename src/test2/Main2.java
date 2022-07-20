package test2;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(2);
            return;
        }
        int max = 0;
        for (int key : map.keySet()) {
            int count = 0;
            for (int i : map.keySet()) {
                if (i == key) {
                    count = count + map.get(key) * 2;
                }else if (i >= ((float)(key) / 2)) {
                    count = count + map.get(i);
                }
            }
            if (count > max) {
                max = count;
            }

        }
        System.out.println(max);
    }
}
