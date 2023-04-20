/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node[] nodes = new Node[100];
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        int index = node.val-1;
        if(nodes[index] == null) {
            nodes[index] = new Node(node.val);
            for(Node innerNode : node.neighbors) {
                nodes[index].neighbors.add(cloneGraph(innerNode));
            }   
        }
        return nodes[index];
    }
}