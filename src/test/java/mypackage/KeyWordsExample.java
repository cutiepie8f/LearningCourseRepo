package mypackage;

public class KeyWordsExample extends ListExample{

    int a = 7;
     final double pie = 3.14;
    public static void main(String[] args) {
        KeyWordsExample k = new KeyWordsExample();
        k.m1();
        k.m2();
    }
    public void m1()
    {
        int a = 5;
        System.out.println(a);
        System.out.println(this.a);
    }
    public void m2()
    {
        int a = 7;
        //pie = 3.1423;
        System.out.println(pie);
        System.out.println(super.a);

    }


}
