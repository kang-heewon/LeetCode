import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) {
            return new ArrayList<>();
        }
        int rangeStart = nums[0];
        int rangeEnd = nums[0];

        var result = new ArrayList<String>();

        for(int index = 0; index < nums.length; index++) {
            int num = nums[index];
            if(index == nums.length - 1) {
                rangeEnd = num;
                this.addRange(rangeStart, rangeEnd, result);
                continue;
            }
            if(num + 1 != nums[index + 1]) {
                this.addRange(rangeStart, rangeEnd, result);
                rangeStart = nums[index + 1];
                rangeEnd = nums[index + 1];
                continue;
            }
            rangeEnd = num + 1;
        }

        return result;
    }

    private void addRange(int start, int end, List<String> result) {
        if(start == end) {
            result.add(String.format("%d", start));
        } else {
            result.add(String.format("%d->%d", start, end));
        }
    }
}