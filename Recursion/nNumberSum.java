public class nNumberSum {
    public static void main(String[] args) {
        System.out.println(sum(30));
    }
    public static int sum(int x){
        if(x==1)
            return 1;
        return x+sum(x-1);
    }


}
