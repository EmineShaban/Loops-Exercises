import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int len = num.length();
        double result = 0;
        for (int i = 0; i < len; i++) {
             char a = num.charAt(i);
            double number = Double.parseDouble(String.valueOf(a));
             result += Math.pow(number, len);

        }
        if (result == Double.parseDouble(num)){
            System.out.println("true ");
        }else {
            System.out.println("false ");

        }


     }
}