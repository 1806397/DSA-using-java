public class countOfNodes  {
    public static int index=-1;
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
    public static Node create(int[] nodes){
        index++;
        if(nodes[index]==-1)
                return null;
        Node newNode=new Node(nodes[index]);
        newNode.left=create(nodes);
        newNode.right=create(nodes);
        return newNode;

    }

    public static int count(Node root){
        if(root==null)
            return 0;
        int left=count(root.left);
        int right=count(root.right);
        return  left+right+1;
    }
    public static int sum(Node root){
        if(root==null)
            return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.value;
    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=create(nodes);
        System.out.println(count(root));
        System.out.println(sum(root));
    }
}
