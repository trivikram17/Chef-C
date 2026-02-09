import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            int cost1 = y1 * x2;
            int cost2 = y2 * x1;

            if (cost1 < cost2) {
                System.out.println(-1);
            } else if (cost1 > cost2) {
                System.out.println(1);  
            } else {
                System.out.println(0);
            }
        }
    }
}
