package test_LinkedList;

public class Node {
    //定义几个属性
    private Object pre;
    private Object obj;
    private Object next;

    public Object getPre() {
        return pre;
    }

    public void setPre(Object pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return ""+obj;
    }
}
