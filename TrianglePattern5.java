public class TrianglePattern5{
    public static void main(String[] args) {
        int n = 5,count=1;
        for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            System.out.print("   ");
        }
        for(int j=1;j<=i;j++){
            if (count < 10) {
                    System.out.print(count + "  ");
            } else {
                    System.out.print(count + " ");
            }
            count++;
        }
        System.out.println();
        }
    }
}