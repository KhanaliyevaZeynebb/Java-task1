import java.util.Scanner;
public class Task19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int cem = 0;
        while (number !=0){
            int qaliq = number%10;
            cem = cem+qaliq;
            number=number/10;
        }
        System.out.println(cem);

    }
}
