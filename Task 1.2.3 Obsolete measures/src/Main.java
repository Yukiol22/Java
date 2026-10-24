//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a weight in grams and i will convert it to medieval measurements: leiviskä, naula, and luoti: ");
        int gram = Integer.parseInt(scanner.nextLine());
        double leiviska = gram / 13.28 / 32 / 20;
        double naula = (leiviska - Math.floor(leiviska)) * 20;
        double luoti = Math.round((naula - Math.floor(naula)) * 32 *100);

        System.out.print(gram + " grams is "+ (int)leiviska + " leiviskä, "+ (int)naula +" naula, and " + luoti/100 +" luoti.");
    }
}