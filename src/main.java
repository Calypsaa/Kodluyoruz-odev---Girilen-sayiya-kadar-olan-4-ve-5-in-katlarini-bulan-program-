import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayi girin:");
        sayi = scanner.nextInt();

        System.out.println("4 un kuvvetleri");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5 in kuvvetleri");
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println(j);
        }
    }
}
