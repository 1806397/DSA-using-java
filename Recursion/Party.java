public class Party {
    public static void main(String[] args) {
        System.out.println(guest(4));
    }
    public static int guest(int n){
        if(n<=1)
            return 1;
        //way1
        int way1=guest(n-1);
        //way2
        int way2=(n-1)*guest(n-2);
        return way1+way2;
    }
}
