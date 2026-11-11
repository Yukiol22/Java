import java.io.*;

public class Main {
    public static void main(String[] arg){
        try {
            Writer writer = new FileWriter( "fibonacci.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            long x = 0;
            long y = 1;
            long z = 0;
            bufferedWriter.write(1 +". " + 0);
            bufferedWriter.newLine();
            for (int i = 2; i <= 60; i ++){
                z = x + y;
                y = x;
                x = z;
                bufferedWriter.write(i +". " + z);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            System.err.println(e);
        }
    }
}
