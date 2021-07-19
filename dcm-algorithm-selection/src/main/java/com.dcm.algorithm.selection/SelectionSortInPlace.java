package com.dcm.algorithm.selection;

public class SelectionSortInPlace {

    // arr[0...i) 是有序的；arr[i...n) 是无序的
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSortExample.sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println( );
    }
}
