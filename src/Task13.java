import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cem = 0;
        for (int i=1; i<=n; i++){
            cem=cem+i;

        }
        System.out.println(cem);
    }
}
