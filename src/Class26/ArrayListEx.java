package Class26;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList();
        words.add("Java");
        words.add("Spain");
        words.add("Usa");
        words.add("ElSalvador");
        words.add("Pakistan");
        words.add("Ukraine");
        words.add("France");
        words.add("Palestine");


        var iterator = words.iterator();

        while(iterator.hasNext()){
            var item=iterator.next();
            if (item.endsWith("e")){
                iterator.remove();
            }
        }

    }
}
