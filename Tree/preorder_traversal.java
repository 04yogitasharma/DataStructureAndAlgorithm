package Tree;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class preorder_traversal {

    public static void preorder(node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
    node root=new node(40);
    root.left=new node(10);
    root.right=new node(50);
    root.left.left=new node(5);
    root.left.right=new node(15);
    preorder(root);
}
}
