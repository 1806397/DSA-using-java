//Number of Nodes in the longest path between any 2 nodes is diameter of tree
public class diameterOfTree {
    public static int index=-1;
    static class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    public static Node create(int[] nodes){
        index++;
        if(index>=nodes.length||nodes[index]==-1)
            return null;
        Node newNode=new Node(nodes[index]);
        newNode.left=create(nodes);
        newNode.right=create(nodes);
        return newNode;
    }
    public static int diameter(Node root){
        if(root==null)
            return 0;
        int diameterLeft=diameter(root.left);
        int diameterRight=diameter(root.right);

        return Math.max(Math.max(diameterLeft,diameterRight),diameterLeft+diameterRight+1);
    }
    public static void main(String[] args) {
        int[] nodes ={7,11,2,7,1,11,9,7,-1,-1,-1,-1,-1,-1,9,-1,-1};
        Node root=create(nodes);
        System.out.println(diameter(root)-1);

    }

}
