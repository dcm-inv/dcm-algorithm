package com.dcm.algorithm.selection;

/**
 * 选择排序法
 * 先把最小的元素拿出来
 * 再剩下拿出来最小的元素
 * 再剩下拿出来最小的元素
 * ......
 * 一直到数组结束
 * 每次选择还没有处理的元素里面的最小元素
 * 排序过程占用了额外的空间，可否原地完成
 *
 * 原地排序
 * arr[i,n)未排序   arr【0...i)已排序 循环不变量
 * arr[i,n)中的最小值放到arr[i]位置
 * ......
 * 依此类推，直到数组最大位置结束
 *
 */
public class SelectionSortExample {

    private SelectionSortExample(){}

    public static void sort(int[] arr){

        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for(int i = 0; i < arr.length; i ++){

            // 选择 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for(int j = i; j < arr.length; j ++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j){

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){

        int[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSortExample.sort(arr);
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
