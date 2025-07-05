import java.util.Scanner;

public class navg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = sc.nextDouble();
            sum += num;
        }

        double avg = sum / n;

        System.out.println("Average is: " + avg);
    }
}
