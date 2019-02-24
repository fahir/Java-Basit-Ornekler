
import com.google.gson.*;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author Win
 */
public class Hava_Durumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, JSONException {
        ArrayList<String> il = new ArrayList<>();
        String t2, t3, t4, t5 = "";
        int bir, iki, uc, dort, bes;
        URL url, url2;

        // url = new URL("https://servis.mgm.gov.tr/api/merkezler/ililcesi?il=%C5%9Fanl%C4%B1urfa");
        url = new URL("https://servis.mgm.gov.tr/api/tahminler/gunluk?istno=96311");
        URLConnection conn = url.openConnection();
        //  URLConnection conn2 = url2.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        String inputLine;

        t2 = "";
        while ((inputLine = in.readLine()) != null) {
            //   System.out.println("kısa");
            t2 += inputLine;
            //  System.out.println(inputLine);
        }
        t3 = t2.substring(1, t2.length() - 1);
        // t3 = t2;
        System.out.println(t3);
        JSONObject myJsonObject = new JSONObject(t3);
        System.out.println(myJsonObject.get("enDusukGun1"));
        /*
        JSONArray myJsonArray = (JSONArray) myJsonObject.get("iller");
        for (int i = 0, size = myJsonArray.length(); i < size; i++) {

            JSONObject myJObject = myJsonArray.getJSONObject(i);
            String ilce = (String) myJObject.get("ilce");
            System.out.println(ilce);

        }*/
    }
}
