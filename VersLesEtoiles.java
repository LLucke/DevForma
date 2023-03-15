import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class VersLesEtoiles {

    public static void main(String[] args) {
        System.out.println("Quel est votre destination ?");

        Scanner scan = new Scanner(System.in);
        String destination = Scan.nextLine();

    }

    static String getJSON() {
        String jsonString = "";

        try {
            String key = "FWroo2achZr9nam197RZnLbI0v7Naj80DbdOyGXt";
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=" + key);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            InputStreamReader fluxDonnee = new InputStreamReader(connection.getInputStream());

            BufferedReader fluxExtractionDonnee = new BufferedReader(fluxDonnee);

            String nextLine;

            while ((nextLine = fluxExtractionDonnee.readLine()) != null) {
                jsonString = jsonString + nextLine;

            }

            fluxExtractionDonnee.close();
            fluxDonnee.close();

            } catch (Exception e) {
            // exeception: handle exception



            }
            System.out.println(jsonString);
            return jsonString;

    }
}