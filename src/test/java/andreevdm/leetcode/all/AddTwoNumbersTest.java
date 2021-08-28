package andreevdm.leetcode.all;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() throws Exception {
        test(342, 465);
        test(100, 1);
        test(9, 9);
    }

    public static void test(int num1, int num2) {
        Assertions.assertThat(toNodes(num1 + num2))
                .isEqualTo(AddTwoNumbers.addTwoNumbers(toNodes(num1), toNodes(num2)));
    }

    private static AddTwoNumbers.ListNode toNodes(int number) {
        if (number == 0) {
            return null;
        }

        AddTwoNumbers.ListNode node = new AddTwoNumbers.ListNode(number % 10);
        node.next = toNodes(number / 10);
        return node;
    }

}
