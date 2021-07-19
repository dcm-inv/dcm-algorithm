package com.dcm.algorithm.insertion;

/**
 * 插入排序法
 * arr[0,i)已排序；
 * arr[i......n)未排序
 * 把arr[i]放到合适的位置
 * 顺序规则，当执行的第几个数组编号是i
 * 运行到i位置时候，对比arr[i]和arr[i+1]的值。注意：arr[i+1]也是代码中的arr[j]
 * 重复上面的排序方式，arr[j]和arr[i]进行对比，依次对比到arr[0,i)已排序的首位，arr[0,i)不是最终排序方式
 * 直到i=n-1，数据为arr[0,n]时结束对比
 * 算法复杂度是O(n^2)
 */
public class InsertionSort {

    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){

        for(int i = 0; i < arr.length; i ++){

            // 将 arr[i] 插入到合适的位置
//            for(int j = i; j - 1 >= 0; j --){
//                if(arr[j].compareTo(arr[j - 1]) < 0)
//                    swap(arr, j - 1, j);
//                else break;
//            }

            for(int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j --)
                swap(arr, j - 1, j);
        }
    }

    private static <E> void swap(E[] arr, int i, int j){

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static <E extends Comparable<E>> boolean isSorted(E[] arr){

        for(int i = 1; i < arr.length; i ++)
            if(arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static void main(String[] args){

        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("InsertionSort", arr);
        }
    }
}
