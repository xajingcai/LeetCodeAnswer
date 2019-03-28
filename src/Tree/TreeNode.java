package Tree;

public class TreeNode {
    public String value;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode(TreeNode rightNode,TreeNode leftNode,String value){
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    public TreeNode(String value){
        this.value = value;
    }

    public TreeNode(){

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
