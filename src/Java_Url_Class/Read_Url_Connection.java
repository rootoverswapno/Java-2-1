package Java_Url_Class;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Read_Url_Connection {
    public static void main(String[] args) {
        try {
            // Create a URL object with the target URL
            URL url = new URL("https://github.com/rootoverswapno");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (optional, default is GET)
            connection.setRequestMethod("GET");

            // Get the input stream from the connection and read the data
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }

            // Close the input stream
            in.close();

            // Print the content
            System.out.println("Content from the URL:");
            System.out.println(content.toString());

            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
