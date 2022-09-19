package Tree;
class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class postorder_traversal {
    public static void postorder(node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(10);
        root.right=new node(50);
        root.left.left=new node(5);
        root.left.right=new node(15);
        postorder(root);
    }
}
