import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int məbləğ = sc.nextInt();
        int faiz = sc.nextInt();
        int nəticə = (məbləğ * faiz) / 100;
        System.out.println("Faiz:" + nəticə);
    }
}
