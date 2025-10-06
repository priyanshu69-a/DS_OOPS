public class pat {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int total_colsinrow = row > n ? 2*n-row: row;
            int spaces=n-total_colsinrow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");

            }
            for (int col = 0; col < total_colsinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
