import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(
            Arrays.asList('A','A','B','B','C','C','C','D','D')
        );

        
        LinkedHashSet<Character> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);  // [A, B, C, D]
    }
}