import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentList {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(); // Class with fail-fast iterator. Does not copy
        //List<String> stringList = new CopyOnWriteArrayList<>(); // Class with fail-safe iterator. Copying
        stringList.add("one");
        stringList.add("one and a half");
        stringList.add("two");
        stringList.add("two and a half");
        stringList.add("three and a half");

        System.out.println("Before " + stringList);

        // Loop option #1
        for (String next : stringList) {
            if (next.equals("two and a half")) {
                stringList.add("three");
            }
        }

        // Loop option #2
        /*Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (next.equals("two and a half")) {
                stringList.add("three");
            }
        }*/

        System.out.println("After " + stringList);
    }
}
