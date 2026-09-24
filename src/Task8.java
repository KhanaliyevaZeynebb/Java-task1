import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int yaş = sc.nextInt();
        if (yaş<=12) {
            System.out.println("Uşaq");
        } else  if (yaş<=17) {
            System.out.println("Yeniyetmə");
        } else {
            System.out.println("Yetişkin");

        }
    }


}
