class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
        this.left=null;
        this.right=null;
    }
}

public class treedemo {

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val<root.val){
            root.left = insert(root.left, val);
        }else if(val>root.val){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    public static void main(String args[]){
        Node root = null;
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root, 30);
        root = insert(root,2);

        System.out.print("Inorder traversal :");
        inorder(root);
    }

}
