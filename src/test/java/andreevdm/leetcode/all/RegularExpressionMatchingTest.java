package andreevdm.leetcode.all;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 * https://leetcode.com/problems/regular-expression-matching/
 */
public class RegularExpressionMatchingTest {
    @Test
    public void isMatch() throws Exception {
        invalid("aaba", "ab*a*c*a");
        valid("a", "ab*");
        valid("a", "ab*b*");
        valid("ac", "ab*cc*d*");
        valid("aa", "a*");
        invalid("aa", "a");
        valid("aa", "aa");
        invalid("aaa", "aa");
        valid("aa", ".*");
        valid("ab", ".*");
        valid("aab", "c*a*b");
        valid("b", "c*a*b");
        valid("b", "c*a*b*b");
        invalid("b", "c*a*bb");
        invalid("b", "c*a*bb.");
        valid("abc", "...");
        valid("aaabc", "a*aaabc");
        valid("aaabc", "a*abc");
    }

    private static void valid(String string, String pattern) {
        Assert.assertTrue(RegularExpressionMatching.isMatch(string, pattern));
    }

    private static void invalid(String string, String pattern) {
        Assert.assertFalse(RegularExpressionMatching.isMatch(string, pattern));
    }
}