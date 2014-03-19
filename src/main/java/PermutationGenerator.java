import sun.util.logging.resources.logging;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PermutationGenerator {
    static PrintWriter printWriter;

    public void generate(String str) throws FileNotFoundException {
        printWriter = new PrintWriter("permuteLogs.txt");
        permute("", str);
        printWriter.close();
    }

    void permute(String prefix, String str) {
        int n = str.length();
        if(n == 0)
            System.out.println(prefix);
        else {
            logValues(prefix, str, n);
            for(int i = 0; i < n; i++)
                permute(prefix+str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    void logValues(String prefix, String str, int n) {
            printWriter.println(prefix + "\t\t" + str + "\t\t" + n);
            printWriter.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        PermutationGenerator generator = new PermutationGenerator();
        generator.generate("abcd");
    }

}


