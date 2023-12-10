public class startsWith {
    class Node{
        Node [] children;
        boolean eow;
        Node(){
            children=new Node[26];
            for (int i = 0; i < 26; i++)
                children[i]=null;
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
    public boolean search(String prefix){
            Node curr=root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null)
                return false;
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
       String[] words={"apple","app","mango","man","women"};
       String prefix="z";
       startsWith obj1=new startsWith();
        for (int i = 0; i < words.length; i++) {
            obj1.insert(words[i]);
        }
        System.out.println(obj1.search(prefix));
    }
}
