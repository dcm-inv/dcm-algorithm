package com.dcm.algorithm.linear;

public class LinearSearchArrayGenerator {

    public static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++)
            if (data[i].equals(target))
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int n = 10000;
        Integer[] data = ArrayGenerator.generateOrderedArray(n);
        long start = System.currentTimeMillis( );
        for (int k = 0; k < 100; k++)
            LinearSearchArrayGenerator.search(data, n);
        long time = System.currentTimeMillis( ) - start;
        System.out.println("n = " + n + " , 100 runs : " + time + "ms");
    }
}
