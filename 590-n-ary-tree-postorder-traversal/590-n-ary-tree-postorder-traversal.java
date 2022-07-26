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
    List<Integer> answer = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if (root == null) return answer;
        
        for(Node node: root.children) {
            postorder(node);
        }
        
        answer.add(root.val);
        return answer;
    }
}