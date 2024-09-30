package ecom;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;

public class StartAppiumServer {

    private AppiumDriverLocalService service;

    public void startAppiumServer() {
        // Define the path of the Appium executable
        String appiumPath = "C:/Program Files/Appium/resources/app/node_modules/appium/build/lib/main.js"; // Path to Appium binary (for Mac/Linux)
        // For Windows use: "C:/Program Files/Appium/resources/app/node_modules/appium/build/lib/main.js"

        // Building the Appium Service
      
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File(appiumPath))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
      //  service.s
        // Starting the Appium server
        service.start();
        
        if (service.isRunning()) {
            System.out.println("Appium server started successfully.");
        } else {
            System.out.println("Failed to start Appium server.");
        }
    }

    public void stopAppiumServer() {
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium server stopped.");
        }
    }

    public static void main(String[] args) {
        StartAppiumServer appiumServer = new StartAppiumServer();
      //  appiumServer.startAppiumServer();

        // Add your test execution code here

        appiumServer.stopAppiumServer();
    }
}
