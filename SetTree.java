import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {


    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        Boolean found =false;

        Iterator itr = colors.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("Yellow")) {
                itr.remove();
                found = true;
                break;
            }
        }

        if(found)
        {
            colors.add("Pink");
        }
            System.out.println(colors); // unordered and replaced yellow

        TreeSet<String>color = new TreeSet<>();
        color.addAll(colors);
        System.out.println(color);  // sorted

    }
}
