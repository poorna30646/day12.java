import java.util.*;
class fire
{
    public static void main(String args[])
    {
        LinkedList<String> a = new LinkedList<>();
        a.add("hello");
        a.add("Iam");
        a.add("Poorna");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}