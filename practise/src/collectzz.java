import java.util.*;

class hashset{
    HashSet<String> set=new HashSet();
    HashSet<String> set1=new HashSet();
  void perform(){
      set.add("One");
      set.add("Two");
      set.add("Three");
      set.add("Four");
      set.add("Five");
      System.out.println(set);
      System.out.println(set.isEmpty());
      System.out.println(set.size());
      System.out.println(set.contains("Two"));
      set.remove("Three");
      System.out.println(set);
      System.out.println(set.contains("Five"));
      set1.addAll(set);
      System.out.println(set1);
  }
}

class linkedhashset{
    LinkedHashSet<String> set1=new LinkedHashSet();
    LinkedHashSet<String> set2=new LinkedHashSet();
    void perform(){
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");
        System.out.println(set1);
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        System.out.println(set1.contains("Two"));
        set1.remove("Three");
        System.out.println(set1);
        System.out.println(set1.contains("Five"));
        set2.addAll(set1);
        System.out.println(set1);

    }
}

class sortedset{
    SortedSet set = new TreeSet();
    void perform(){
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet("b"));
        System.out.println(set.subSet("a","b"));
        System.out.println(set.tailSet("a"));
        System.out.println(set.size());
        System.out.println(set);
    }

}

class arraydeque{
    Deque<String> deque = new ArrayDeque<String>();
    void perform(){
        deque.add("abc");
        deque.add("def");
        deque.add("ghi");
        System.out.println(deque);
        deque.offerFirst("neymar");
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        System.out.println(deque.isEmpty());
        System.out.println(deque.size());
        System.out.println(deque);
    }
}

class priorityqueue{
    PriorityQueue<String> queue=new PriorityQueue<String>();
    void perform(){
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}

public class collectzz {

    public static void main(String[] args) {
    hashset h=new hashset();
    linkedhashset l=new linkedhashset();
    sortedset s=new sortedset();
    arraydeque a=new arraydeque();
    priorityqueue p=new priorityqueue();
    h.perform();
    l.perform();
    s.perform();
    a.perform();
    p.perform();
    }
}
