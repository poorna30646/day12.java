import java.util.*;
class fire{
    public static void main(String args[])
    {
        HashMap<String,String> a= new HashMap<>();
        a.put("Sno","01");
        a.put("SName","Poorna");
        a.put("city","chennai");
        System.out.println(a);
        //modifing value for a key
        a.put("SNO","90");
        System.out.println(a);
        //removing key in ahash map
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
