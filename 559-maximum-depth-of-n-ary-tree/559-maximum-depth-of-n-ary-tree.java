/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        int answer = 0;
        if (root == null) {
            return answer;
        }
        for (Node node: root.children) {
            answer = Math.max(answer, maxDepth(node));
        }
        answer++;
        return answer;
    }
}