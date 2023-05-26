import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        StringBuilder txt = new StringBuilder();
        System.out.println("Please Input number");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n > 0) {
            tong += n % 10;
            n = n / 10;
        }
        System.out.printf("Tong cac chu so cua n la: %S = %d", txt.toString(), tong);
    }
}
