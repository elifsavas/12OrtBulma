import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, k, x = 0, total = 0;
        double ort;

        x = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {

                total += i;
                x++;

            }
        }

        System.out.println(total / x);
    }

}
