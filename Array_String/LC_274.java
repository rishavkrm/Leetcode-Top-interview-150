package TopInterview150.Array_String;

import java.util.Arrays;

public class LC_274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int _hindex = 0;
        for (int j = citations.length - 1; j >= 0; j--) {
            if (citations[j] > citations.length - j - 1) {
                _hindex += 1;
            }
        }
        return _hindex;
    }
}
