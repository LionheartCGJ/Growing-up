package MinimumValueOfAnArrayOfRotations;

/*
 * 
 *题目描述
 *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 */

public class Solution {

	public int minNumberInRotateArray(int[] array) {
		if (array.length > 0) {
			if(array.length == 1){
				return array[0];
			}
			int prev = 0, mid, end = array.length;
			while (prev < end) {
				mid = (prev + end) / 2;
				if (array[prev] < array[mid]) {
					prev = mid;
				} else if (array[prev] > array[mid]) {
					end = mid;
				} else {
					return array[mid+1];
				}

			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().minNumberInRotateArray(new int[]{4}));

	}

}
