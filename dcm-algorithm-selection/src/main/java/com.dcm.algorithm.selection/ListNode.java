package com.dcm.algorithm.selection;

//Definition for singly-linked list.
public class ListNode {

    public static void testExceptionWithFirst(int[] nums) {
        try{
            for(int i=0;i<nums.length;i++){
                if(nums[i] %2 == 0 ){
                    throw new Exception(  );
                } else {
                    System.out.println("a" );
                }
            }
        } catch (Exception e) {
            System.out.println("b" );
        }finally {
            System.out.println("c" );
        }
    }

    public static void main(String[] args) {
        try{
            testExceptionWithFirst(new int[]{0,1,2,3,4,5,6});
        } catch (Exception e) {
            System.out.println("d" );
        }
    }
}