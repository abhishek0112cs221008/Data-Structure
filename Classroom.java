import java.util.ArrayList;  
// import java.util.*;  

public class Classroom {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }


    public static int max_arraylist(ArrayList<Integer> list,int size){
        //Find maximum in ArrayList -------------------------------
        int max = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        return max;
    }


    public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println();
        System.out.println("All the element in array List is : "+list);

        int ele = list.get(2);
        System.out.println("At index 3 element is : "+ele);

        list.remove(4);
        System.out.println("After remove element in array List is (index 4) : "+list);

        System.out.println(list.contains(4));
        System.out.println(list.contains(11));

        list.add(4,5);
        System.out.println("After adding element at index 4 and value is 5 So again list is : "+list);
        list.add(4, 6);
        System.out.println(list);

        int size = list.size();
        System.out.println("Size of array list is : "+size);

        //print array list using loop
        System.out.println("print array list using loop : ");
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        System.out.println("print reverse array list using loop : ");
        for(int i=size-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //Find maximum in ArrayList 
        int maxele  = max_arraylist(list, size);
        System.out.println("Max element in arrayList is : "+maxele);

        //swap element in Arraylist
        System.out.println("before swap list is : "+list);
        swap(list, 1, 3);
        System.out.println("After swap list is : "+list);

    }
}
