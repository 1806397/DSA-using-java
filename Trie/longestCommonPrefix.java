public class longestCommonPrefix {
    public String answer="";
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
    public void longestWord(Node root,StringBuilder str){
        if(root==null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if(root.children[i]!=null && root.children[i].eow==true){
                str.append((char)(i+'a'));
                if(str.length()>answer.length()){
                answer=str.toString();
                }
                longestWord(root.children[i],str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        longestCommonPrefix obj1=new longestCommonPrefix();
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
            obj1.insert(words[i]);
        }
        obj1.longestWord(obj1.root,new StringBuilder(""));
        System.out.println(obj1.answer);
    }
}
