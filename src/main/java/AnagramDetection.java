import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class AnagramDetection {

    int detector(String parent, String child) {
        ArrayList<String> anagramList = Lists.newArrayList();
        generateAnagrams(anagramList, child);
        return occurenceCounter(anagramList, parent);
    }

    void generateAnagrams(ArrayList<String> anagramList, String child) {
        char[] stringArray = child.toCharArray();
        heapPermute(stringArray.length, stringArray, anagramList);
    }

    void heapPermute(int n, char[] stringArray, List<String> anagramList) {
        if(n==1){
          anagramList.add(new String(stringArray));
        }
        else{
            for(int i = 0; i < n; i ++){
                heapPermute(n - 1, stringArray, anagramList);
                 if(n % 2 == 1)
                    swap(0, n-1, stringArray);
                else
                    swap(i, n-1, stringArray);
            }
        }

    }

    void swap(int i, int j, char[] stringArray){
        char temp = stringArray[i];
        stringArray[i] = stringArray[j];
        stringArray[j]= temp;
    }


    int occurenceCounter(ArrayList<String> anagramList, String parent) {
        int counter = 0;
        for(String anagram : anagramList){
            if(parent.contains(anagram))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        AnagramDetection anagramDetection = new AnagramDetection();
        String parent = "AdnBndAndBdaBn";
        String child = "And";
        int frequency = anagramDetection.detector(parent, child);
        System.out.println(frequency);
    }

}
