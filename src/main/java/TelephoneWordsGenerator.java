import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public class TelephoneWordsGenerator {

    static Map<Character, String> characterMap = Maps.newHashMap();
    static PrintWriter printWriter;


    public void generateWords(String number) throws FileNotFoundException {
        characterMap.put('0', "0");
        characterMap.put('1', "1");
        characterMap.put('2', "ABC");
        characterMap.put('3', "DEF");
        characterMap.put('4', "GHI");
        characterMap.put('5', "JKL");
        characterMap.put('6', "MNO");
        characterMap.put('7', "PRS");
        characterMap.put('8', "TUV");
        characterMap.put('9', "WXY");

        ArrayList<String> words = Lists.newArrayList();
        printWriter = new PrintWriter("telephoneWords.txt");
        generate("", number, 0, words);
        printWriter.close();
        for(String word : words)
            System.out.println(word);
    }

    void generate(String prefix, String number, int index, ArrayList<String> words){
        if(index == number.length()) {
            words.add(prefix);
        }
        else {
            logValues(prefix, number, index);
            for(char letter : characterMap.get(number.charAt(index)).toCharArray()){
               generate(prefix+letter, number, index+1, words);
            }
        }
    }

    void logValues(String prefix, String number, int index) {
        printWriter.println(prefix + "\t\t" + number + "\t\t" + index);
        printWriter.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        TelephoneWordsGenerator generator = new TelephoneWordsGenerator();
        generator.generateWords("4971927");
    }

}

