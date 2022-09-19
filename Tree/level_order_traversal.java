package Tree;

import java.util.LinkedList;
import java.util.Queue;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class level_order_traversal {

    public static void printlevelorder(node root){
        if(root==null){
            return;
        }
        Queue<node> q=new LinkedList<>(); 
        q.add(root);

        while(q.isEmpty()==false){
            node curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(30);
        root.right=new node(50);
        root.left.left=new node(20);
        root.right.left=new node(60);

        printlevelorder(root);        //BREADTH FIRST SEARCH
    }

}
