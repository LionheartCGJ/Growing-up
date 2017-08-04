package ReconsturtionOfBinaryTree;

/*
 * 
 *题目描述
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 */

public class Solution {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre != null && in != null) {
			TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in,
					0, in.length - 1);
			return root;
		}
		return null;
	}

	private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd,
			int[] in, int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(pre[preStart]);
		for (int i = inStart; i <= inEnd; i++) {
			if(in[i] == pre[preStart]){
				 root.left = reConstructBinaryTree(pre, preStart+1, preStart+i-inStart, in, inStart, i-1);
				 root.right = reConstructBinaryTree(pre, i-inStart+preStart+1, preEnd, in, i+1, inEnd);
			}
		}

		return root;
	}
	
	public static void main(String[] args){
		int[] pre = {1,2,4,8,9,5,3,6,7};
		int[] in = {8,4,9,5,2,1,6,3,7};
		TreeNode result = new Solution().reConstructBinaryTree(pre, in);
		new Solution().PreviosShow(result);
		
		
	}
	public void PreviosShow(TreeNode root){
		if(root == null){
			return;
		}
		PreviosShow(root.left);
		System.out.print(root.val + ",");
		PreviosShow(root.right);
	}
}
