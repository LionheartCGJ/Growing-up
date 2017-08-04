package FibonacciSequence;

/*
 * 
 *1. 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * 
 * 
 *2.题目描述
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 *(1,2,3,5...f(n-2),f(n-1),f(n-2)+f(n-1))。
 *
 *
 *
 *3.题目描述
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *(1,2,4,8...2^(n-1))
 *
 *4.题目描述
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *(1,2,3,5...f(n-2),f(n-1),f(n-2)+f(n-1))
 *
 */

public class Solution {
	public int recursionFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
		}
	}
	
	  public int Fibonacci(int n) {
		  if(!(n > 0)){
			  return 0;
		  }
		  int num1 = 0;
		  int num2 = 1;
		  for(int i = 1;i < n; i++){
			  int temp = num2;
			  num2 =num1 + num2;
			  num1 = temp;
		  }
		  return num2;
		  
	  }

	public static void main(String[] args) {
		System.out.println(new Solution().Fibonacci(10));
		System.out.println(new Solution().recursionFibonacci(10));
	}

}
