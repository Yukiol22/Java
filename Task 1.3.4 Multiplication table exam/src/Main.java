import java.util.Scanner;
public class Main{
    public static  void main(String[] arg){
        Scanner scnaner = new Scanner(System.in);
        boolean complete = false;
        int totalq = 10;
        int totalright = 0;
        while (!complete){
            for (int i = 1 ; i <= totalq; i++){
                int factor1 = (int) (Math.random() * 10) + 1;
                int factor2 = (int) (Math.random() * 10) + 1;
                System.out.print("Question "+ i + ": What is " + factor1 + " * " + factor2 + " ? ");
                int answer = Integer.parseInt(scnaner.nextLine());
                if (answer == factor1 * factor2){
                    System.out.println("Correct!");
                    totalright++;
                }
                else{
                   System.out.println("Incorrect. The correct answer was " + (factor1*factor2) + ".");
                }
            }
           if (totalright == totalq){
               System.out.println("Score = 10 / 10: congratulations");
               complete = true;
           }
           else{
               System.out.println("You scored " + totalright + " out of 10. Let's try again!");
               System.out.println("Starts a new set of 10 questions");
               totalright = 0;
           }
        }
    }
}