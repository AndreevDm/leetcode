package andreevdm.leetcode.add_two_numbers;

import java.util.Objects;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, false);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean overflow) {
        if (l1 == null && l2 == null & !overflow) {
            return null;
        }
        int result = 0;
        if (l1 != null) {
            result += l1.val;
        }
        if (l2 != null) {
            result += l2.val;
        }
        if (overflow) {
            result++;
        }
        ListNode node = new ListNode(result % 10);
        node.next = addTwoNumbers(nextOrNull(l1), nextOrNull(l2), result >= 10);
        return node;
    }

    public static ListNode nextOrNull(ListNode node) {
        if (node == null) {
            return null;
        }
        return node.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }
}
