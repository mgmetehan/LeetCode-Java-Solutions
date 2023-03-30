public class AddTwoNumbers_2_Medium {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var temp = new ListNode(0);
        var l3 = temp;

        var extra = 0;
        while (l1 != null || l2 != null) {
            var l1Value = (l1 != null) ? l1.val : 0;
            var l2Value = (l2 != null) ? l2.val : 0;

            var sum = l1Value + l2Value + extra;
            extra = sum / 10;
            var lastDigit = sum % 10;

            var newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (extra > 0) {
            var newNode = new ListNode(extra);
            l3.next = newNode;
            l3 = l3.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(1)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l3 = addTwoNumbers(l1, l2);
        while (l3 != null) {
            System.out.print(l3.val);
            l3 = l3.next;
        }
    }
}
