import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me binary num: ");
        String binary = scanner.nextLine();
        int value = 0;
        for(int i = 0 ; i < binary.length(); i++){
            int power = binary.length() - 1;
            char result = binary.charAt(i);
            value += Integer.parseInt(String.valueOf(result)) * Math.pow(2,power-i);
        }
        System.out.print(value);
    }
}