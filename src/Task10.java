import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gün = sc.nextInt();
        switch (gün) {
            case 1:
                System.out.println("Bazar ertəsi" );
                break;
            case 2:
                System.out.println("Çərşənbə axşamı" );
                break;
            case 3:
                System.out.println("Çərşənbə" );
                break;
            case 4:
                System.out.println("Cümə axşamı" );
                break;
            case 5:
                System.out.println("Cümə" );
                break;
            case 6:
                System.out.println("Şənbə" );
                break;
            default:
                System.out.println("Bazar" );

        }
    }
}
