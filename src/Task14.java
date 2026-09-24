import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int say = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                say++;
            }
        }
            System.out.println(say);
        }
    }

