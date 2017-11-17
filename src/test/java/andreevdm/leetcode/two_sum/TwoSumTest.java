package andreevdm.leetcode.two_sum;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 */
public class TwoSumTest {

    @Test
    public void twoSum() throws Exception {
        test(0, 1, 9, 2, 7, 11, 15);
        test(1, 2, 9, 11, 2, 7, 15);
        test(1, 2, 6, 1, 3, 3, 6);
        test(0, 1, 6, 3, 3);
        test(0, 3, 9, 2, 11, 15, 7);
    }

    public static void test(int expectedIndex1, int expectedIndex2, int target, int... nums) {
        Assert.assertArrayEquals(TwoSum.twoSum(nums, target), new int[]{expectedIndex1, expectedIndex2});
    }
}