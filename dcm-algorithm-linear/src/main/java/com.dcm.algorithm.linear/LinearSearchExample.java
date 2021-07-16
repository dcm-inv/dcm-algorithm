package com.dcm.algorithm.linear;

public class LinearSearchExample {

    private LinearSearchExample() {
    }

    /**
     * 循环不变量
     * 1、找到正确的循环不变量
     * 2、维护循环体
     * 3、清楚输入和输出的内容
     * <p>
     * 复杂度分析--通常看最差的情况
     * 算法运行的上界for循环
     * n=data.length
     * T=n? T=2n? T=3n? ......依次类推直到结束
     * T=c1*n+c2
     * 常数不重要--复杂度的描述是随着数据规模n的增大，算发的性能的变化趋势越大
     * 假设：T1=10000n    T2=2n^2
     * 存在某一个临界点n0，当n>n0,T1<t2
     * n>5000的时候，O(n) < O(n^2)
     * n=5000的时候，O(n) = O(n^2)
     * n<5000的时候，O(n) > O(n^2)
     *
     * 日常我们说 O(n) 的算法优于 O(n^2)的
     * 复杂度：O(n)
     *
     * @param data
     * @param target
     * @return
     */
    public static int search(int[] data, int target) {
        // for (int i = 0; i < data.length; i++)循环就是在维持循环不变量
        for (int i = 0; i < data.length; i++) {
            // data[i]是否是目标【data在[0~i-1] 一直不是目标】
            // if (data[i] == target)就是循环不变量
            if (data[i] == target) {
                // data[i]进入这里就是目标
                return i;
            }
            // data[i]不是目标【data在[0~i] 一直不是目标】
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res = LinearSearchExample.search(data, 16);
        System.out.println(res);
        int res2 = LinearSearchExample.search(data, 666);
        System.out.println(res2);
    }
}