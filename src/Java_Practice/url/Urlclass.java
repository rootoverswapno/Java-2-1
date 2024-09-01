package Java_Practice.url;

import java.net.MalformedURLException;
import java.net.URL;

public class Urlclass {
    public static void main(String[] args) {
        String url="https://www.linkedin.com/in/swapnomoy-biswas-ab3b32235/";
        //Cllaing method to get URL info
        geturlinfo(url);
    }
    static void geturlinfo(String url_String)
    {
        //creating object of url class
        try {
            URL url =new URL(url_String);
            System.out.println("Hostnamne : "+url.getHost());
            System.out.println("Port Number : "+url.getPort());
            System.out.println("File name :"+url.getFile());
            System.out.println("Protocol :"+url.getProtocol());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
