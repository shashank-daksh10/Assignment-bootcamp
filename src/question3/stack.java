//package question3;
//







// NOT USING THIS METHOD  {IGNORE}
// NOT USING THIS METHOD  {IGNORE}
// NOT USING THIS METHOD  {IGNORE}
// NOT USING THIS METHOD  {IGNORE}
// NOT USING THIS METHOD  {IGNORE}










//public class stack {
//    class node {
//        int val;
//        int min;
//        node next;
//
//        node(int val, int min, node next) {
//            this.val = val;
//            this.min = min;
//            this.next = next;
//        }
//
//        node head;
//
//        public void push(int x) {
//            if (head == null) {
//                head = new node(x, x, null);
//            }
//            head = new node(head.val, Math.min(head.min, x), head);
//        }
//
//        public int pop() {
//            if (head == null) return 0;
//
//            node temp = head;
//            head = head.next;
//            return temp.val;
//        }
//
//        public int peek() {
//            return head.val;
//        }
//
//        public int getMin() {
//            return head.min;
//        }
//
//    }
//}
//
