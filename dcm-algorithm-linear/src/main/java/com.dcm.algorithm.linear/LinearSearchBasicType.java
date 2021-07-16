package com.dcm.algorithm.linear;

public class LinearSearchBasicType {

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] data = {11, 23, 17, 16, 28, 58};
        System.out.println(search(data, 16));
        System.out.println(search(data, 666));
    }
}
