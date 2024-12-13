import java.util.*;
class fire{
    public static void main(String args[])
    {
        HashSet<String> a=new HashSet<>();
        a.add("poorna");
        a.add("pc gamer");
        System.out.println(a);
        HashSet<String> b=new HashSet<>();
        b.add("chandra");
        b.add("pc gamer2");
        System.out.println(b);
        a.addAll(b);
        System.out.println(a);

    }
}