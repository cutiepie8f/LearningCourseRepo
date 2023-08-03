package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    int a = 78;
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(34);
        //System.out.println(l1);
        l1.add(39);
       // System.out.println(l1);
        l1.add(38);
        //System.out.println(l1);
        l1.add(34);
        System.out.println(l1);
        //System.out.println( l1.get(1));

        for(int b:l1)
        {
            System.out.println(b);
        }

        List<String> name = new ArrayList<String>();
        name.add("Abhi");
        //System.out.println(name);
        name.add("Rishabh");
        //System.out.println(name);
        name.add("Jyoti");
        //System.out.println(name);
        name.add("Rishabh");
        System.out.println(name);
        //System.out.println( name.get(1));

        for(String a:name)
        {
            System.out.println(a);
        }






    }
}
