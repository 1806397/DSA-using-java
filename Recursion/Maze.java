public class Maze {
    public static int count;
    public static void main(String[] args) {
        int m=3;
        int n=4;
        maze(0,0,n,m);
        System.out.println("Total combination "+count);
    }
    public static int maze(int i,int j ,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            count++;
            return 1;
        }

        //move downwards
        int downside=maze(i+1,j,n,m);
        //move right
        int right=maze(i,j+1,n,m);
        return downside+right;
    }
}
