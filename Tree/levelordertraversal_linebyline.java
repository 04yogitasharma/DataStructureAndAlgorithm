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

public class levelordertraversal_linebyline {

    public static void lineByLine(node root){
        if(root==null){return;}
        Queue <node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(30);
        root.right=new node(50);
        root.left.left=new node(10);
        root.left.right=new node(15);

        lineByLine(root);
    }
}
