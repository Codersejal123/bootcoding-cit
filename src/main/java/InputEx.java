


import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n = sc.nextInt();
        System.out.println("Enter Second Number:");
        int m = sc.nextInt();
        int add = n + m;
        System.out.println("Addition =" + add);
        int sub = n - m;
        System.out.println("Substraction =" + sub);
        int multi = n * m;
        System.out.println("Multiplication =" + multi);
        int div = n / m;
        System.out.println("Division =" + div);
        int mod = n % m;
        System.out.println("Modolus =" + mod);


    }
}
