import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class VersLesetoiles {
    private static final String Try = null;
    
      public static void main(String args[]) {
        System.out.println("Quel est votre destination?");

        Scanner scan = new Scanner(System.in);
        String destination = scan.next();

        String stringJson = getJSON();
        JSONObject jsonObject = new JSONObject(stringJson);
        String url = jsonObject.getString("url");
        System.out.println(url);
        DowloadImage(url);

        


    }
    /**
     * @param imageURL
     */
    static void DowloadImage(String imageURL) {
        try{
            URL url = new URL(imageURL) ;
            InputStream inputStream = url.openStream() ;
            OutputStream outputStream = new FileOutputStream("downloaded_image.jpg");
            int nextByte;
            while (
                (nextByte = inputStream.read()) !=-1)
                {
                    outputStream.write(nextByte);
                }
                inputStream.close();
                outputStream.close();

        }
        catch (Exception exception) {}
    }

    static String getJSON() {
        String jsonString = "";

        try {
            String key = "FWroo2achZr9nam197RZnLbI0v7Naj80DbdOyGXt";

            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key="+key);
            
            //Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            //Get Byte from connection, prendre les données en brut
            InputStreamReader fluxDonnee = new InputStreamReader(connection.getInputStream());
            
            //Convert Byte to string stream=flux, pour extraire les données en chaine de caractère
            BufferedReader fluxExtractionDonnee = new BufferedReader(fluxDonnee);
            String nextLine;
            while ((nextLine = fluxExtractionDonnee.readLine()) != null){
                jsonString = jsonString + nextLine;

            }

            fluxExtractionDonnee.close();
            fluxDonnee.close();

        } catch (Exception exception)
        
        
        {


        }

        System.out.println(jsonString);
        return jsonString;

    }
}