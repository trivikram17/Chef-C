import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long diff = b - a;

            // same logic as your loop, just jumped
            if (diff % 3 == 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
