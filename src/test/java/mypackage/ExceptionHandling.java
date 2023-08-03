package mypackage;

public class ExceptionHandling {
    public static void main(String[] args) {
        String a = "&123";
        String c = "543";
//        int b = Integer.parseInt(a);
//        System.out.println(b+1);
        System.out.println(a.concat(c));
        System.out.println(a.substring(1,3));
        System.out.println(a.substring(1));


        try
        {

            int b = Integer.parseInt(a);
            System.out.println(b+1);
        }
        catch (NumberFormatException e)
        {
            String removeDollar = a.substring(1);
            int b = Integer.parseInt(removeDollar);
            System.out.println(b+8);
        }


    }




}
