import java.util.Scanner;
class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println(fact);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
