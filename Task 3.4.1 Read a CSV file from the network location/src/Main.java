import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        URL myUrl;
        String line;
        double count = 0;
        int countLine = 0;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader ireader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(ireader);
            while((line = reader.readLine()) != null){
                String[] arr = line.split(";");
                if (!arr[0].contains("Aika") ) {
                    if (!arr[0].contains("01.01.2023")) {
                        break;
                    }
                }
                if (!arr[1].contains("UlkoTalo")){
                    countLine++;
                    count += Double.parseDouble(arr[1].replace(",", "."));
                }
            }
            Double avg = count / countLine;
            System.out.println("Average temperature for the 1st day of January 2023 is " + avg + " Rounded: " + Math.round(avg * 100.) /100.0 + "°C");

        }catch (IOException e){
            System.err.println(e);
        }
    }
}