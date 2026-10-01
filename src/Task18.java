import java.util.Scanner;
public class Task18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ters = 0;
        while (number !=0){
            int qaliq = number % 10;
            ters = ters*10 + qaliq;
            number = number /10;

        }
        System.out.println(ters);
    }

}