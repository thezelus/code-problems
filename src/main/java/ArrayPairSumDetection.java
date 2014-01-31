import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayPairSumDetection {

    /*void findArrayPairSum(int desiredSum, int[] numberArray){
        Arrays.sort(numberArray);
        int i = 0, j = numberArray.length-1, tempSum, first, second;
        while (i<j){
            first = numberArray[i];
            second = numberArray[j];
            tempSum = first + second;
            if(tempSum == desiredSum){
                System.out.println(Integer.toString(first) + " : " + Integer.toString(second));
                i++;
            }
            else if(tempSum<desiredSum)
                i++;
            else if(tempSum>desiredSum)
                j--;
        }

    }*/

    void findArrayPairSumForUnsortedArray(int desiredSum, int[] numberArray){
        int temp = 0, length = numberArray.length;
        System.out.print("[");
        for(int i =0; i< length; i++){
            temp = desiredSum - numberArray[i];
            for(int j = i + 1; j < length ; j++){
                if(numberArray[j] == temp )
                    System.out.print(" [" +Integer.toString(numberArray[i]) + "," + Integer.toString(temp) + "] ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayPairSumDetection arrayPairSumDetection = new ArrayPairSumDetection();
        arrayPairSumDetection.findArrayPairSumForUnsortedArray(10, new int[]{7, 4, 6, 5, 3});
        System.out.println();
        arrayPairSumDetection.findArrayPairSumForUnsortedArray(8, new int[]{4, 4, 5, 3, 4});
    }


}
