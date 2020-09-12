package Ada;

import sun.jvm.hotspot.opto.HaltNode;

import java.util.*;

public class Mainwangyi3 {
    static class Node {
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
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        } else {
            List<Integer> heights = new LinkedList<>();
            for (Node item : root.children) {
                heights.add(maxDepth(item));
            }
            return Collections.max(heights) + 1;
        }
    }

    public static int solution(int[] array, int n, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            if(array[i] == 0){
                List<Node> list0 = new ArrayList<>();
                Node node0child = new Node(i + 1, null);
                list0.add(node0child);
            }
        }
        // List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        int max = (int)obj[obj.length - 1];
        Node root = new Node(0, )

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] address = new int[n - 1];
        for(int i = 0; i < n - 1; i++){
            address[i] = scanner.nextInt();
        }
        solution(address, n, k);
    }
//    6 3
//    0 0 2 3 3
}
