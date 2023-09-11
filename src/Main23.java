import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= 1000; i++) {
            if(i % 10 == num){
                System.out.println(i);

            }
         }
     }
}