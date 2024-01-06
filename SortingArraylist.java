import java.util.*;
// import java.util.ArrayList;

public class SortingArraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(6);

        System.out.println("Unsorted ArrayList is : "+list);

        Collections.sort(list);
        System.out.println("sorted ArrayList is (Ascending order) : "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sorted ArrayList is (Descending order) : "+list);
    }
}
