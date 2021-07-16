package com.dcm.algorithm.linear;

public class LinearSearchGenerics {

    public static int search(Integer[] data, int target) {
        for(int i = 0; i < data.length; i++)
            if(data[i].equals(target))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data ={11,23,17,123,16,28,58};
        System.out.println(search(data,16));
    }
}
