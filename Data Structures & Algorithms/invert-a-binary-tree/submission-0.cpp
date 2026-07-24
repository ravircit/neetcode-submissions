/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
TreeNode* invertTree(TreeNode* node) {
	if (node == NULL)
		return node;
	else
	{
		TreeNode* temp;

		/* do the subtrees */
		invertTree(node->left);
		invertTree(node->right);

		/* swap the pointers in this node */
		temp = node->left;
		node->left = node->right;
		node->right = temp;
	}
	return node;
}
};

