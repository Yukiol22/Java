import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers? ");
        int size = Integer.parseInt(scanner.nextLine());
        int curretn;
        int[] numbers = new int[size];
        int line1 = 0;
        int line2 = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the integers: ");
            numbers[i] = scanner.nextInt();
        }
        int mxs = numbers[0];
        for(int i = 0; i < size; i++){
            curretn = 0;
            for (int j = i ; j < size; j++){
                curretn += numbers[j];
                System.out.println("cuurent " + curretn);
                if (curretn >= mxs){
                    System.out.println(curretn + ">="+ mxs);
                    mxs = curretn;
                    line1 = i + 1;
                    line2 = j + 1;
                }
            }
        }
        System.out.println("Maximum sum: "+ mxs);
        if (line2 == line1){
            System.out.println("Integers on line: "+ line1 );
        }else{
            System.out.println("Integers: "+ line1 +"-"+line2);
        }
    }
}