package mypackage;

public class PolymorphismExample {
    public static void main(String[] args) {
        m1(8,9);
    }

    public static void m1(int a)
    {
        System.out.println(a);
    }
    public static void m1(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void m1(String a,int b,int c)
    {
        System.out.println(c+b);
        System.out.println(a);
    }
    public static void m1(String a,int b)
    {
        System.out.println(a);
        System.out.println(b);

    }
    public static void m1(int a,String b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}
