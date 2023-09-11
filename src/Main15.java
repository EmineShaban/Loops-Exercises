import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
         int num = number;
        System.out.printf("%d ", num);

        while (num != 1){
            if(num % 2 == 0){
                num = num / 2;
                System.out.printf("%d ", num);
            }else{
                num = num * 3 +1;
                System.out.printf("%d ", num);

            }
        }


     }
}