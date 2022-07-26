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
    
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()) {
            root = stack.pop();
            answer.add(root.val);
            for(Node node: root.children) {
                stack.add(node);
            }
        }
        Collections.reverse(answer);
        return answer;
    }
}