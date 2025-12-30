public class A05_29_25 {
    public static void main(String[] args) {
        for (char i = 65; i <= 96; i++) {
            if(i == 'G'){
                break;
            } else {
                System.err.println(i);
            }
        }
    }
}