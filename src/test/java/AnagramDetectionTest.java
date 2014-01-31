import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;

public class AnagramDetectionTest {
    @Test
    public void testHeapPermute() throws Exception {
        AnagramDetection anagramDetection = new AnagramDetection();
        String testString = "ABCD";
        ArrayList<String> testAnagramList = Lists.newArrayList();
        anagramDetection.heapPermute(testString.length(), testString.toCharArray(), testAnagramList);
        assert(testAnagramList.size() == 24);
        assert(testAnagramList.contains("ABCD"));
        assert(testAnagramList.contains("DCBA"));
        assert(testAnagramList.contains("CDAB"));
    }
}
