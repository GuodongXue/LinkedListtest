package test_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class test01 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");

        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
