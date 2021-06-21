package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ConfigFileReader {
        // public ExcelReader excelReader;
        private final HashMap<String, String> configuration = new HashMap<>();

        public ConfigFileReader() {
            Properties properties = new Properties();
            try {
                properties.load(utils.ConfigFileReader.class.getClassLoader().getResourceAsStream("config.properties"));
            } catch (IOException e) {
                System.out.println("exception" + e);
                //Do nothing properties file is probably missing from resources.
                //We shall print a warning and move ahead and not stall the test execution.
                System.out.println("Warning :: Properties file is missing in resources: 'config.properties'");
            }
            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                configuration.put(key, value);
            }
        }

        public String getConfigValue(String key) {
            return configuration.get(key);
        }

    }

