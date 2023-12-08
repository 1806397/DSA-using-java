public class RemoveDuplicate {
    public static String check="";
    public static void main(String[] args) {
        String name="mississippi";
        duplicates(name,0);
        System.out.println(check);
    }
    public static void duplicates(String name,int index){
        if(index==name.length()-1)
            return;
        if(check.contains(""+name.charAt(index))){
            duplicates(name,index+1);
        }else{
            check+=name.charAt(index);
            duplicates(name,index+1);
        }
    }
}
