import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfFloors = Integer.parseInt(sc.nextLine());
        int numOfRooms = Integer.parseInt(sc.nextLine());

        for (int i = numOfFloors; i > 0 ; i--) {
            if(i == numOfFloors){
                for (int j = 0; j < numOfRooms; j++) {
                    System.out.printf("L%d%d ", i, j );
                }
            }else if(i % 2 ==0){
                System.out.printf("%n");

                for (int j = 0; j < numOfRooms; j++) {
                    System.out.printf("O%d%d ", i, j );
                }
            }else{
                System.out.printf("%n");

                for (int j = 0; j < numOfRooms; j++) {
                    System.out.printf("A%d%d ", i, j );
                }
            }
        }

    }
}