import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert how many time do you want show values of Fibonacci Sequence: ");
        int number = scan.nextInt();
       int n1 = 0, n2 = 1, sum = 0;

        System.out.println(n1 + " " + n2);

        for(int i = 2; i < number; i++){
            sum = n1 + n2;
            System.out.println(" " + sum);
            n1 = n2;
            n2 = sum;

            scan.close();
        }
    }
}
