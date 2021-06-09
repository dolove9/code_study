package com.basic;

public class 순열 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int output[] = new int [arr.length];
        boolean visited[] = new boolean [arr.length];
        int n = 4;

        perm(arr, output, visited, 0, n, 3);
        System.out.println();
    }

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for(int i =0 ; i < r; i++) {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;;
            }
        }
    }
}
