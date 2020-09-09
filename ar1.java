package arraylist;
import java.util.*;


/**
 *
 * @author User
 */
public class ArrayList {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("peace");
        list.add("kindness");
        list.add("self control");
        list.add("humbleness");
        list.add("goodness");
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("List:"+list);
        list.replaceAll(t->t.toUpperCase());
        list.replaceAll(t->t+"s");
        System.out.println("Plural:"+list);
        Collections.reverse(list);
        System.out.println("Reversed List:"+list);
        list.removeIf(t->t.endsWith("s"));
        System.out.println("Plural words removed:"+list);
        // TODO code application logic here
    }
    
}