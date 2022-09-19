package Tree;

import java.util.Stack;

public class  binary_to_spiralform {
    static void binaryToSpiral(node root){
        if(root==null){return ;}

        Stack<node> s1=new Stack <node>();
        Stack<node> s2=new Stack <node>();
        s1.add(root);

        while(!s1.isEmpty()||!s2.isEmpty()){
            while(!s1.empty()){
                node temp=s1.peek();
                s1.pop();
                System.out.print(temp.key+" ");

                if(temp.right!=null){
                    s2.add(temp.right);
                }

                if(temp.left!=null){
                    s2.add(temp.left);
                }
            }
            while(!s2.empty()){
                node temp=s2.peek();
                s2.pop();
                System.out.print(temp.key+" ");

                if(temp.left!=null){
                    s1.add(temp.left);
                }

                if(temp.right!=null){
                    s1.add(temp.right);
                }
            }
        }

    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(20);
        root.right=new node(70);
        root.left.left=new node(30);
        root.right.right=new node(80);

        binaryToSpiral(root);
    }
}
