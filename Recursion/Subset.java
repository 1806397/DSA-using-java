import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        allSubset(n,subset);
    }
    public static void printSet(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void allSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSet(subset);
            return;
        }
        //add
        subset.add(n);
        allSubset(n-1,subset);
        //not add
        subset.remove(subset.size()-1);
        allSubset(n-1,subset);

    }
}
