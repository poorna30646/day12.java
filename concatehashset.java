import java.util.*;
class fire{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> a=new HashSet<>();
        //accepting the values into the hash set
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Integer s=sc.nextInt();
            a.add(s);
        }
        System.out.println(a);
        HashSet<Integer> b=new HashSet<>();
        int n1=sc.nextInt();
        for(int i1=0;i1<n1;i1++)
        {
            Integer s1=sc.nextInt();
            a.add(s1);
        }
        System.out.println(b);



    }
}