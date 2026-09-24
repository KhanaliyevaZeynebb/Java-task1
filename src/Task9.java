import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bal = sc.nextInt();
        int onluq = bal / 10;

        switch(onluq) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");

        }
    }
}
