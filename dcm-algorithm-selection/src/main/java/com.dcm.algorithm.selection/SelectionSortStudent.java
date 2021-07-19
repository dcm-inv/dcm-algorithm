package com.dcm.algorithm.selection;

public class SelectionSortStudent {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 98),
                new Student("Jhon", 100),
                new Student("Charles", 66)
        };
        SelectionSortStudent.sort(students);
        for (Student student : students)
            System.out.print(student + " ");
        System.out.println( );
    }
}
