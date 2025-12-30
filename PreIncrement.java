public class PreIncrement{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a);
        ++a;
        int res = (++a + ++a);
        System.out.println(res);
    }
}