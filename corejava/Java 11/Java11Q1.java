@FunctionalInterface
interface Func<M1,M2,M3,M> {
     M apply(M1 m1, M2 m2, M3 m3);
}
public class Java11Q1
{
    public static void main (String[] args)
    {
        Func <Integer,Integer,Integer,Integer>  i = ( var p,var t,var r) -> (p*t*r);
        System.out.println("simple interest = " + i.apply(10,20,50));
    }
}
