public class Selection {
    public static void main(String[] args) {
        int arr[]={13,15,2,3,18,5,0};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
