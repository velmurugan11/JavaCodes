public class SquarePattern4 {
    public static void main(String[] args) throws Exception {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // Thread.sleep(450);
                if(j==0||j==n-1||j==n/2||i==n/2){
                    System.out.print("* ");
                } // Top half (except middle row)
                else if (i < n / 2) {
                    System.out.print((char) 4 + " ");   // ♦
                }
                // Bottom half
                else {
                    System.out.print((char) 1 + " ");   // ☺
                }
                
            }
            System.out.println();
        }
    }
}