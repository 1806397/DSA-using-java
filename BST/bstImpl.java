public class bstImpl {
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return root;
        }if(root.value>data){
           root.left= insert(root.left,data);
        }else{

            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.value+" ");
        Inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(key<root.value)
            return search(root.left,key);
        else if(key==root.value)
            return true;
        else
           return search(root.right,key);
    }
    public static Node delete(Node root,int data){
        if(root.value>data){
            root.left=delete(root.left,data);
        }else if(root.value<data){
            root.right=delete(root.right,data);
        }else{
            //case 1
            if(root.left==null && root.right==null)
                return null;
            //case2
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            //case3
            Node Is=inorderSuccessor(root.right);
            root.value=Is.value;
            root.right=delete(root.right,Is.value);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null)
            root=root.left;

        return root;
    }
    public static void main(String[] args) {
       int values[]={5,1,3,4,2,7,0};
       Node root=null;
        for (int i = 0; i < values.length; i++) {
        root=insert(root,values[i]);
        }
        Inorder(root);
        System.out.println(search(root,7));
        System.out.println(search(root,-2));
        delete(root,3);
        Inorder(root);
    }
}