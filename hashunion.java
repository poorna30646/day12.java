import java.util.*;
class fire{
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7};
        int arr2[]={6,7,8,9,5};
        HashSet <Integer> a= new HashSet<>();
        HashSet <Integer> b= new HashSet<>();
        for(int s : arr)
        a.add(s);
        for(int s1 : arr2)
        a.add(s1);
        System.out.println(a);
        System.out.println(b);
        HashSet <Integer> u=new HashSet<>(a);
        System.out.println(u);
        u.addAll(b);
        System.out.println(u);




    }
}

