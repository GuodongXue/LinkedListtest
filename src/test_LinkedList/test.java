package test_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test {

    /*
    增加： addFirst addLast offerFirst
    查看： getFirst getLast peekfirst peekLast
    删除： pollFirst pollLast removeFirst removeLast
     */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("ass");
        list.add("asss");
        list.add("assss");
        list.add("asssss");
        list.add("assssss");
        System.out.println(list);
        list.clear();
        list.pollFirst();
        list.pollLast();
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //for(String s: list){
         //   System.out.println(list.get(s));
        // }

        /*Iterator<String> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

         */
        //还有一种for循环办法
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

    }
}
