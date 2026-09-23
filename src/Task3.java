import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double məbləğ = sc.nextInt();
        double faiz = sc.nextInt();
        double nəticə = (məbləğ * faiz) / 100;
        System.out.println("Faiz:" + nəticə);
    }
}
