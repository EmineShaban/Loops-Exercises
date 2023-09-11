import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int magic = Integer.parseInt(sc.nextLine());
        int num = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {

            for (int j = a; j <= b; j++) {
                count++;
                num = i + j;
                if(num == magic){
                    a = i;
                    b = j;
                     break;
                }
            }
            if(num == magic) {
                break;
            }


        }

        if(num == magic){
            System.out.printf("Combination %d - (%d + %d = %d)", count , a, b, magic);


         }else{
            System.out.printf("%d combinations - neither equals %d", count, magic);

        }


    }
}