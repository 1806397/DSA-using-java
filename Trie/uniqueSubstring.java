public class uniqueSubstring {
    class Node{
        Node [] children;
        Boolean eow;
        public Node(){
            children=new Node[26];
            for (int i = 0; i < 26; i++) {
             children[i]=null;
            }
            eow=false;
        }
    }
    Node root=new Node();
    public void insert(String key){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
            curr.children[idx]=new Node();
            }
            if(i==key.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    public int countNodes(Node root){
        if(root==null)
            return 0;
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i]!=null)
                count+=countNodes(root.children[i]);
        }
        return count+1;
    }
    public static void main(String[] args) {
        uniqueSubstring obj1=new uniqueSubstring();
        String str="ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix=str.substring(i);
            obj1.insert(suffix);
        }
        System.out.println(obj1.countNodes(obj1.root));
    }
}
