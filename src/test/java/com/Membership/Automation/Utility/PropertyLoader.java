package com.Membership.Automation.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    public static Properties loadData() throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/com.Membership.Automation.Properties/Browsers.properties");
        Properties p = new Properties();
        p.load(file);
        String env= p.getProperty("Environment");
        try {
            if (env.equalsIgnoreCase("Staging")) {
                FileInputStream f = new FileInputStream("src/main/java/com.Membership.Automation.Properties/TestDataStaging.properties");
                p.load(f);
            }
            else if (env.equalsIgnoreCase("Prod")) {
                FileInputStream f = new FileInputStream("src/main/java/com.Membership.Automation.Properties/TestDataProd.properties");
                p.load(f);
            }
            //   else if (env.equalsIgnoreCase("preprod")) {
            // FileInputStream f = new FileInputStream("./src/main/java/resources/TestDataPreprod.properties");
            //  p.load(f);
            // }

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return p;
    }
}
