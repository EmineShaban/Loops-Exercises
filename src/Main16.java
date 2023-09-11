import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
        if(i == 1){
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
        }else if(i == n){
            System.out.printf("%n");
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
        }else{
            System.out.printf("%n");

            for (int j = 0; j < m; j++) {
                if (j == 0){
                    System.out.print("*");
                } else if (j == m-1) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");

                }
            }
        }


        }
    }
}