package mypackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(23);
        //System.out.println(s1);
        s1.add(67);
        //System.out.println(s1);
        s1.add(256);
        //System.out.println(s1);
        s1.add(23);
        //System.out.println(s1);
        s1.add(29);
        System.out.println(s1);

        for(int a : s1)
        {
            System.out.println(a);
        }


        Set<String> name = new HashSet<String>();
        name.add("afsh");
        name.add("afsh");
        name.add("ywhj");
        System.out.println(name);
        for(String b:name)
        {
            System.out.println(b);
        }
        }
    }
