public class TrianglePattern6 {
    public static void main(String[] args) {
        int n = 5, count = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i>=j){
                    System.out.print((char)(count)+" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}