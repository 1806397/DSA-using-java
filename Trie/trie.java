public class trie {
    class Node{
        Node [] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    Node root=new Node();
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){ //O(L) L=length of largest word
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
                return false;
            if(i==word.length()-1 && curr.children[idx].eow==false)
                return false;
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any"};
        trie obj=new trie();
        for(int i=0;i< words.length;i++){
            obj.insert(words[i]);
        }
        System.out.println(obj.search("their"));
        System.out.println(obj.search("thor"));
        System.out.println(obj.search("an"));

    }
}
