public class NumberChangingPattern {
    public static void main(String[] args) {
        int res = 0;
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(res+=1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
