package util;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prp;

    public ConfigReader() throws Exception {

        InputStream fis = getClass()
                .getClassLoader()
                .getResourceAsStream("Testdata/config.properties");

        prp = new Properties();
        prp.load(fis);
    }

    public String getBrowser() {
        return prp.getProperty("browser");
    }

    public String getAppURL() {
        return prp.getProperty("app");
    }

    public String getUsername() {
        return prp.getProperty("user");
    }

    public String getPassword() {
        return prp.getProperty("pwd");
    }
}
