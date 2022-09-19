package Tree;
class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class height_binary_tree {
    public static int heightBinaryTree(node root){
        if(root==null){
             return 0;
        }
        else{
            return Math.max(heightBinaryTree(root.left),heightBinaryTree(root.right))+1;
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(10);
        root.right=new node(50);
        root.left.left=new node(5);
        root.left.right=new node(15);

        System.out.println( heightBinaryTree(root));
    }
}
