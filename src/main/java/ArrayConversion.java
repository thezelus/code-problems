import javax.xml.soap.SOAPPart;

public class ArrayConversion {

    void convertArray(String[] array){
        int n = array.length/2;
        for(int i = 1 ; i<n; i++)
            swap(array, i, n+i-1);

    }

    void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        String array[] = new String[]{"a1","a2", "a3", "a4", "a5", "b1", "b2", "b3", "b4", "b5"};
        //String array[] = new String[]{"a1","a2", "a3", "b1", "b2", "b3"};
        print(array);
        ArrayConversion arrayConversion = new ArrayConversion();
        arrayConversion.convertArray(array);
        print(array);
    }

    static void print(String[] array) {
        System.out.println();
        for(String s : array){
            System.out.print(s + " ");
        }
    }
}
