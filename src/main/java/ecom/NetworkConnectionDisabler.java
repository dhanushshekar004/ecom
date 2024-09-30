package ecom;
import java.io.IOException;

public class NetworkConnectionDisabler {
    public static void main(String[] args) {
        // Replace '14.192.2.179' with the actual IP address you want to disable
        String ipToDisable = "14.192.2.179";

        // Build the command to disable the network connection
        
        String[] command = {"C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "enable", "-n", ipToDisable};

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // You can add code here to handle the process, monitor its output, or wait for it to finish.
            int exitCode = process.waitFor();
          
            if (exitCode == 0) {
                System.out.println("Network connection disabled successfully.");
            } else {
                System.err.println("Failed to disable network connection. Exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

