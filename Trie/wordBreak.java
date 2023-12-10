public class wordBreak {
    class Node{
        Node [] children;
        boolean eow;
        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++)
                children[i]=null;
            eow=false;
        }
    }
    Node root=new Node();
    public void insert(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
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
    public boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for (int i = 1; i <=key.length(); i++) {
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart) && wordBreak(secondPart))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","like","samsung","sam","mobile"};
        String key="ilikesamsung";
        wordBreak obj1=new wordBreak();
        for (int i = 0; i < words.length; i++) {
            obj1.insert(words[i]);
        }
        System.out.println(obj1.wordBreak(key));
    }
}
