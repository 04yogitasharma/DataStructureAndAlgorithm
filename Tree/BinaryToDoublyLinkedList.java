package Tree;
class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class BinaryToDoublyLinkedList {

    static node prev=null;
    
    static node bToDoLL(node root){

        if(root==null){
            return root;}
        node head=bToDoLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        bToDoLL(root.right);
        return head;
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(20);
        root.right=new node(70);
        root.left.left=new node(30);
        root.right.right=new node(80);

        node head=bToDoLL(root);
        node curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }
}
