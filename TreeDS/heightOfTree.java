public class heightOfTree {
    static int index=-1;
    static class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
        this.value=value;
        this.right=null;
        this.left=null;
        }
    }
    public static Node create(int[] node){
        index++;
        if(index>=node.length||node[index]==-1)
            return null;
        Node newNode=new Node(node[index]);
        newNode.left=create(node);
        newNode.right=create(node);
        return newNode;
    }
    public static int height(Node root){
        if(root==null)
            return 0;
        int left=height(root.left)+1;
        int right=height(root.left)+1;
        return Math.max(left,right);
    }
    public static void main(String[] args) {
        int[] nodes ={7,11,2,7,1,11,9,7,-1,-1,-1,-1,-1,-1,9,-1,-1};
//        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=create(nodes);
        System.out.println(height(root));


    }
}
