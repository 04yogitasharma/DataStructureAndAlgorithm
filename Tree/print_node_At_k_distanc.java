package Tree;
class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class print_node_At_k_distanc {
    public static void print_node(node root,int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.print(root.key+" ");
        }
        else{
            print_node(root.left, k-1);
            print_node(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        node root=new node(30);
        root.left=new node(20);
        root.right=new node(50);
        root.left.left=new node(5);
        root.left.right=new node(15);

        int k=1;
        print_node(root,k);

    }
}
