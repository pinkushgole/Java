//user static keyword in java

package Static_keyword;

public class Static_Keyword {
    static int a;

    public static void main(String bca[]) {
        Static_Keyword s1 = new Static_Keyword();
        Static_Keyword s2 = new Static_Keyword();
        Static_Keyword s3 = new Static_Keyword();
        s1.a = 10;
        s2.a = 20;
        s3.a = 100;
        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(s3.a);
        System.out.println(a);
        System.out.println(Static_Keyword.a);
    }

}
