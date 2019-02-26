import sun.awt.SunHints;

/**
 * @program: tensquare_parent
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-02-21 10:36
 **/
public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){
        this.data = data;
    }

    //添加一个node
    public  Node  append(Node node){
        //当前节点
        Node newNode = this;
        //循环添加当前节点
        while (true){
            //取出下一个节点
            Node nextnNode = newNode.next;
            if (newNode ==null){
                break;
            }
        }
            //赋值节点
            newNode.next=node;
        return this;

    }
    //取出当前节点数据
    public  int getData(){
        return this.data;
    }
}
