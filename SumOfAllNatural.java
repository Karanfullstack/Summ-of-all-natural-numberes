import java.util.Scanner;
public class SumOfAllNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num, sum;
        System.out.println("Enter Number");
       num = sc.nextInt();
       sum = (num * (num + 1) / 2);
        System.out.println(sum);
    }
}

