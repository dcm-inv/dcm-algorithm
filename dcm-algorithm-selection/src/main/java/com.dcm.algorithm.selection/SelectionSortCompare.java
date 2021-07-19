package com.dcm.algorithm.selection;

public class SelectionSortCompare {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        // 第一层运行N次
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            // 第二层1+2+3+4+......+n得到1/2 * n^2+1/2 * n
            for(int j=i; j < arr.length;j++) {
                if(arr[j].compareTo(arr[minIndex]) <0) {
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
        // 得到最终值是O(n^2)的复杂度
    }

    private static <E> void swap(E[] arr, int i, int minIndex) {
        E t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;
    }

    public static void main(String[] args){
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSortCompare.sort(arr);
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

}
