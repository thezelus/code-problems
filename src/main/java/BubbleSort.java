import java.lang.reflect.Array;
import java.util.ArrayList;

public class BubbleSort {
    public void sortList(ArrayList<Integer> unsortedList){
        int size = unsortedList.size();
        for(int i = 0; i <size; i++){
            displayList(unsortedList);
            for(int j = 0; j<size-i-1; j++){
                if(unsortedList.get(j) > unsortedList.get(j+1))
                    swap(j, j+1, unsortedList);
            }
        }
    }

    void swap(int i, int j, ArrayList<Integer> list){
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    void displayList(ArrayList<Integer> list){
        System.out.println();
        for(int i : list)
            System.out.print(Integer.toString(i) + "  ");
    }
}
