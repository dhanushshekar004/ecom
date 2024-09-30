package ecom;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class bbbbbb {
    public static void main(String[] args) {
        // Replace '14.192.2.179' with the actual IP address you want to disable
        String ipToDisable = "14.192.2.179";

        // Build the command to disable the network connection
        String[] command = {"C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "enable", "-n", ipToDisable};

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // You can add code here to handle the process, monitor its output, or wait for it to finish.
            boolean exitCode = process.waitFor(3, TimeUnit.SECONDS);
            
            if (exitCode == true) {
                System.out.println("Network connection disabled successfully.");
            } else {
                System.err.println("Failed to disable network connection. Exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


