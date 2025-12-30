public class PostIncrement{
    public static void main(String[] args) {
        int a = 14;
        a++;
        System.out.println(a++);
        System.out.println(a++ + ++a);
        int  b = a++ + ++a;
        System.out.println(b);
    }
}