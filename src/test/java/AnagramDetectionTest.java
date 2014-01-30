import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

public class AnagramDetectionTest {
    @Test
    public void testHeapPermute() throws Exception {
        AnagramDetection anagramDetection = new AnagramDetection();
        String testString = "ABCD";
        ArrayList<String> testAnagramList = Lists.newArrayList();
        anagramDetection.heapPermute(testString.length(), testString.toCharArray(), testAnagramList);
        assert(testAnagramList.size() != 0);
    }
}
