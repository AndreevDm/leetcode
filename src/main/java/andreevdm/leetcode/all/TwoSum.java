package andreevdm.leetcode.all;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elementToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer pairElementIndex = elementToIndex.get(target - num);
            if (pairElementIndex != null) {
                return new int[]{pairElementIndex, i};
            }
            elementToIndex.put(num, i);
        }
        throw new IllegalStateException("No solution");
    }
}
