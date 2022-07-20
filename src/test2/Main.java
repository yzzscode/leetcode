package test2;

import java.util.*;

public class Main {
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
        int M = Integer.MIN_VALUE;
        int N = Integer.MAX_VALUE;
        int count1 = 0;
        int count2 = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) > count1) {
                count1 = map.get(key);
                M = key;
            }else if (map.get(key) == count1) {
                if (key > M) {
                    M = key;
                }
            }
            if (map.get(key) < count2) {
                count2 = map.get(key);
                N = key;
            }else if (map.get(key) == count2) {
                if (key < N) {
                    N = key;
                }
            }
        }
        System.out.println(M - N);
    }
}
