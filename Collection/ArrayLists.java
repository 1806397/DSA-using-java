import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(0);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //get
        System.out.println(list.get(2));
        //insert
        list.add(2,1);
        System.out.println(list);
        System.out.println(list);
        //set
        list.set(1,9);
        System.out.println(list);
        //remove
        list.remove(list.size()-1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        List<Integer> doubleValue= list.stream().map(x->x*x).collect(Collectors.toList());
        int total=doubleValue.stream().reduce(0,(i,cur)->i+cur);

        doubleValue.stream().forEach(s-> System.out.println(s));
        System.out.println("double Value "+doubleValue+" total "+total);
    }
}