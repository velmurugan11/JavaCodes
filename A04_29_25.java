public class A04_29_25 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(!(i%8==0 || i%4==0 || i%16==0)){
                System.out.println(i);
            }
        }
    }
}