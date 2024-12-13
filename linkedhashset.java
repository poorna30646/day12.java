import java.util.*;
class fire{
    public static void main(String args[])
    {
        LinkedHashSet<String> a =new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("hi");
        a.add("Students");
        //printing using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    

    }
}
