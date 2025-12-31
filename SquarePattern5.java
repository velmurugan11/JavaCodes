public class SquarePattern5 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
}