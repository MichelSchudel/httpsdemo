package nl.craftsmen;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public class HttpsDemo {

    public static void main(String[] args) throws IOException {
        String httpsURL = "https://www.google.nl/";
        URL myUrl = new URL(httpsURL);
        HttpsURLConnection conn = (HttpsURLConnection)myUrl.openConnection();
    }
}
