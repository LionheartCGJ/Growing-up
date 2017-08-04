package SearchInTwoDimensionalArray;

/*
 * 
 *题目描述
 *在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 */
import java.util.Arrays;

public class Solution {
	public boolean Find(int[][] array, int target) {
		boolean flag = false;
		int indexA = 0;
		for (; indexA < array.length; indexA++) {
			if (target >= array[indexA][0]
					&& target <= array[indexA][array[0].length - 1]) {
				if (Arrays.binarySearch(array[indexA], target) >= 0) {
					return true;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().Find(new int[][] { { 1, 2, 3 },
				{ 2, 3, 4 }, { 3, 4, 5 } }, 5));
	}
}
