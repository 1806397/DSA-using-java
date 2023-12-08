public class Merge {
    public static void conquer(int[] arr,int start,int mid,int end){
        int merged[]=new int[end-start+1];
        int left=start;
        int right=mid+1;
        int x=0;
        while(left<=mid && right<=end){
            if (arr[left] < arr[right]) {
                merged[x]=arr[left++];
            }else{
                merged[x]=arr[right++];
            }
            x++;
        }
        while(left<=mid){
            merged[x++]=arr[left++];
        }
        while(right<=end){
            merged[x++]=arr[right++];
        }
        for (int i = 0,j=start; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr ,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        divide(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
