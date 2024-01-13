package TopInterview150.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class LC_56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,0}};
        merge(intervals);
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        int[][] result = new int[intervals.length][2];
        int count = 0;
        int to = intervals[0][1];
        int from = intervals[0][0]; 
        for (int i = 0; i < intervals.length-1; i++) {
            if(to < intervals[i+1][0]){
                int[] temp = {from,to};
                result[count] = temp;
                from = intervals[i+1][0];
                to = intervals[i+1][1];
                count += 1;
            }
            else if (to >= intervals[i+1][0]) {
                if(from > intervals[i+1][0]){
                    from = intervals[i+1][0];
                }
                if(intervals[i+1][1] > to) to = intervals[i+1][1];
            }
        }
        int[] temp = {from,to};
                result[count] = temp;
        for(int[] r : result){
            System.out.println(r[0]+ " " + r[1]);
        }
        return Arrays.copyOfRange(result, 0, count+1);
    }}