package com.newcode.binary;

/*
 * 
 *题目描述
 *输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 */
public class Solution {

    // 从n的2进制形式的最右边开始判断是不是1
    public static int NumberOf1_one(int n) {
        int count = 0;
        while (n != 0) {

            // 用1和n进行位与运算， 结果要是为1则n的2进制形式 最右边那位肯定是1，否则为0

            if ((n & 1) == 1) {
                count++;
            }
            // 把n的2进制形式往右推一位
            n = n >>> 1;
        }
        return count;
    }

    // ---------------正解--------------------------------
    // 思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
    private static int NumberOf1_two(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    // --------------------最优解----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        // 使用n=10,二进制形式为1010，则1的个数为2；
        int n = 1;
        System.out.println(n + "的二进制中1的个数：" + NumberOf1_two(n));
    }

}
