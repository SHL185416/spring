public class forTest {
    public static void main(String[] args) {
        Node root = new Node(4, new Node(2, new Node(1), new Node(3)), new Node(5));
        Solution solution = new Solution();
        solution.treeToDoublyList(root);



    }

}
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

class Solution {

    public Node treeToDoublyList(Node root) {
        Node pre=null;
        Node head=null;

        if(root == null) return null;

        dfs(root,pre,head);

        head.left = pre;
        pre.right = head;

        return head;
    }
    void dfs(Node cur, Node pre ,Node head) {
        if(cur == null) return;

        dfs(cur.left,pre,head);
        if(pre == null){
            head = cur;
        }
        else if(pre != null){
            pre.right = cur;
        }

        cur.left = pre;
        pre = cur;

        dfs(cur.right,pre,head);
    }
}

