import java.util.LinkedList;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TreeDs {
    static int index=-1;
    class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value=value;
            this.right=null;
            this.left=null;
        }
    }
    public Node createTree(int[] nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node newNode=new Node(nodes[index]);
        newNode.left=createTree(nodes);
        newNode.right =createTree(nodes);
        return newNode;
    }
    public void levelOrder(Node root){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
            }else{
                q.add(null);
            }
            }else{
                System.out.print(currNode.value+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public void preOrder(Node root){
        if(root==null)
            return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeDs obj1=new TreeDs();
        Node root=obj1.createTree(nodes);
        System.out.println(root.value);
        System.out.println("Preorder");
        obj1.preOrder(root);
        System.out.println("Inorder");
        obj1.inOrder(root);
        System.out.println("Postorder");
        obj1.postOrder(root);
        System.out.println("Levelorder");
        obj1.levelOrder(root);
    }
}