import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gün = sc.nextInt();
        switch (gün) {
            case 1:
                System.out.println("Toplama");
                break;
            case 2:
                System.out.println("Çıxma");
                break;
            case 3:
                System.out.println("Vurma");
                break;
            case 4:
                System.out.println("Bölmə");
                break;
        }
    }
}