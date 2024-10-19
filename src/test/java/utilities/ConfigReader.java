package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {

        String dosyaYolu= "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            // UTF-8 karakter kodlamasını kullanarak dosyayı oku
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            properties.load(isr);
        } catch (IOException e) {
            System.out.println("properties dosyasi okunamadi");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
