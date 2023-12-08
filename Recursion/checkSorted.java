public class checkSorted {
    public static boolean returnValue=true;
    public static void main(String[] args) {
        int check[]={1,2,0,5,6};
        check(check,check.length-1);
        System.out.println(returnValue);
    }
    public static void check(int[] arr,int index){
        if(index==1 )
            return;
        if(arr[index]>arr[index-1]){
            check(arr,index-1);
        }else{
            returnValue=false;
        }
    }
}
