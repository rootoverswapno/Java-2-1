package Java_Url_Class;

// importing package required
import java.net.URL;
import java.util.Scanner;

class GFG {
    public static void main(String[] args)
    {
        String url
                = "https://www.geeksforgeeks.org/variables-in-java/";
        // Calling method to get URL info
        getUrlInfo(url);
    }
    static void getUrlInfo(String url_string)
    {
        // Creating object of URL class
        try {
            URL url = new URL(url_string);

            System.out.println("Hostname: "
                    + url.getHost());
            System.out.println("Port Number: "
                    + url.getPort());
            System.out.println("File name: "
                    + url.getFile());
            System.out.println("Protocol: "
                    + url.getProtocol());
        }
        catch (Exception e) {
        }
    }
}

