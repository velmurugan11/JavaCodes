public class A03_29_25 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%3==0 || i%8==0 || i%14==0){
                System.out.println(i);
            }
        }
    }
}