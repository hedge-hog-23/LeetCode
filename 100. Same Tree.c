/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    
    if( p == NULL && q == NULL)  //both are null so true
        return true;
    if(p == NULL || q == NULL)  //1 is null and other is not
        return false;
    if(p->val != q->val)    //check if current nodes have same value
        return false;
    
    return isSameTree(p->left,q->left) && isSameTree(p->right,q->right);  //call recusively the left and right subtrees till leaf 
}
