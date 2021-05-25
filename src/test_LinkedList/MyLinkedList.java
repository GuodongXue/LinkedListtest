package test_LinkedList;

import java.util.LinkedList;

public class MyLinkedList {
    //链表一定有一个头， 也一定有一个尾节点
    Node first;
    Node last;
    int count = 0;

    public void add(Object o){
        //如果放入的是第一个元素
        if(first == null){
            //创建一个节点对象
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            //将这个链表的first和last都只向这个节点
            first = n;
            last = n;

        }else{
            //第二个节点后都走这个分支
            Node n = new Node();
            n.setPre(last);
            n.setObj(o);
            n.setNext(null);
            last.setNext(n);
            last  = n;
        }
        count++;
    }
    public Object  get(int index){
        Node n = first;
        for(int i = 0; i< index; i++){
            n= (Node)(n.getNext());
        }
        return n.getObj();
    }


    public MyLinkedList() {
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        //ll.add();
        MyLinkedList ml = new MyLinkedList();
        ml.add(123);
        ml.add("aaa");
        ml.add("ccc");
        System.out.println(ml);
        System.out.println(ml.get(0).toString());

    }
}
