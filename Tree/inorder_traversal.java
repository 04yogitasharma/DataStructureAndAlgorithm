package Tree;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class inorder_traversal {
    public static void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(10);
        root.right=new node(50);
        root.left.left=new node(5);
        root.left.right=new node(15);

        // inorder(root);
    }
}
