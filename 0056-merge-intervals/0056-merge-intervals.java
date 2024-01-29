import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> result = new ArrayList<>();


        for(int index = 0; index < intervals.length; index++) {
            int[] group = intervals[index];

            if(start >= group[0]) {
                start = group[0];
            }
            if(end <= group[1]) {
                end = group[1];
            }
            if(index == intervals.length - 1) {
                result.add(new int[]{start, end});
                continue;
            }
            if(end < intervals[index + 1][0] || start > intervals[index + 1][1]) {
                result.add(new int[]{start, end});
                start = intervals[index + 1][0];
                end = intervals[index + 1][1];
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}