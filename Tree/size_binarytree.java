package Tree;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class size_binarytree {
    static int size(node root){
        if(root==null){
            return 0;
        }
        else{
            return 1+size(root.left)+size(root.right);
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(30);
        root.right=new node(50);
        root.left.left=new node(10);
        root.left.right=new node(15);
        System.out.println(size(root));                          //CALCULATING NO. OF NODES

    }
}
