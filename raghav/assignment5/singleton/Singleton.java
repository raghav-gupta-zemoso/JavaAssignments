package raghav.assignment5.singleton;

public class Singleton {
    String str;
    public static Singleton returnString(String s)
    {
//        str=s;
//        a static method can access static members & methods only
        return new Singleton();
    }
    public void printString()
    {
        System.out.println(str);
        // output : null
    }


}
