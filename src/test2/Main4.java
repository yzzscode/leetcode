package test2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int num = 0;
        for (int i = 0; i < n - 1; i++) {

            if (arr1[i] > arr1[i + 1]) {
                if (arr2[i] < arr1[i + 1]) {
                    arr1[i] = arr2[i];
                    num++;
                }else if(arr1[i] < arr2[i + 1]){
                    arr1[i + 1] = arr2[i + 1];
                    num++;
                }else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(num);
    }
}

