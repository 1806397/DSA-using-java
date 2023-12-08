public class xPowernTimes {
    public static void main(String[] args) {
        System.out.println(print(10,7));
    }
    public static int print(int x,int n){
        if(n==1)
            return x;
        return x*print(x,n-1);

    }
}
