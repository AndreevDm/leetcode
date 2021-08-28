package andreevdm.leetcode.all;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ShortestPalindromeTest {
    @Test
    void shortestPalindrome() {
        assertThat(ShortestPalindrome.shortestPalindrome("aacecaaa")).isEqualTo("aaacecaaa");
        assertThat(ShortestPalindrome.shortestPalindrome("abcd")).isEqualTo("dcbabcd");
    }
}
