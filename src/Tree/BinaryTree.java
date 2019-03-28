package Tree;

import java.util.Stack;

/**
 * 二叉树
 */
public class BinaryTree {

    public void insertNode(int value) {

    }
    /**
     * 二叉树的先序遍历（非递归实现）
     * @param node
     */
    public void preOrderUnRecur(TreeNode node){
        if(node != null){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.add(node);
            while(!stack.isEmpty()){
                node = stack.pop();
                if(node.rightNode!= null){
                    stack.push(node.rightNode);
                }
                if(node.leftNode != null){
                    stack.push(node.leftNode);
                }
            }
        }
    }
}
