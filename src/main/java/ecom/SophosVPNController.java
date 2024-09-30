package ecom;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SophosVPNController {

    public static void main(String[] args) {
        try {
            // Start the VPN client (replace with the actual command for your VPN client).
            ProcessBuilder startVPNProcess = new ProcessBuilder("C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "--connect");
            Process vpnProcess = startVPNProcess.start();

            // Wait for a few seconds to allow the VPN to connect.
            Thread.sleep(5000);

            // Check the VPN connection status (replace with the actual status check command).
            ProcessBuilder checkStatusProcess = new ProcessBuilder("C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "--status");
            Process statusProcess = checkStatusProcess.start();

            // Read the output of the status command.
            BufferedReader reader = new BufferedReader(new InputStreamReader(statusProcess.getInputStream()));
            String line;
            boolean isConnected = false;

            while ((line = reader.readLine()) != null) {
                // Check if the output indicates a connected state (adjust this condition as needed).
                if (line.contains("Connected")) {
                    isConnected = true;
                    break;
                }
            }

            // Close the reader and processes.
            reader.close();
            statusProcess.waitFor();

            // Check and print the connection status.
            if (isConnected) {
                System.out.println("VPN is connected.");
            } else {
                System.out.println("VPN is not connected.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

