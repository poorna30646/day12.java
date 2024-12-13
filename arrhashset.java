import java.util.*;
class fire{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6};
        int arr2[]={6,7,8,9,5};
        System.out.println(arr);
        System.out.println(arr2);
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s:arr)
        a.add(s);
        for(int s1:arr2)
        a.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set <Integer> u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);



    }
}