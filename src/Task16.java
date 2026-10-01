import java.util.Scanner;
public class Task16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        while (true){
            number= sc.nextInt();
            if (number==0){
                break;
            }
            count++;
        }
        System.out.println(count);


    }
}
