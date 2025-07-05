
import java.util.Scanner;

public class Tyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dealership = sc.nextInt();
        while (dealership > 0) {
            dealership--;
            {
                int cars = sc.nextInt();
                int bikes = sc.nextInt();
                System.out.println(cars * 4 + bikes * 2);
            }
        }
    }

}
