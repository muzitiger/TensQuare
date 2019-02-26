/**
 * @program: tensquare_parent
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-02-21 10:36
 **/
public class MyNode {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2).append(node3);
        System.out.println(node1.next.next.getData());
    }
}
