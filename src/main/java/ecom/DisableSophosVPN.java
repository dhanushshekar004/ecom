package ecom;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisableSophosVPN {

    public static void main(String[] args) {
        try {
            // List the active VPN connections (replace with the actual command for your VPN client).
            ProcessBuilder listConnectionsProcess = new ProcessBuilder("sophosvpnclient", "--list-connections");
            Process listProcess = listConnectionsProcess.start();

            // Read the output of the list-connections command.
            BufferedReader reader = new BufferedReader(new InputStreamReader(listProcess.getInputStream()));
            String line;

            // Search for the connection with the specific IP address to disable.
            String connectionToDisable = null;

            while ((line = reader.readLine()) != null) {
                if (line.contains("14.192.2.179")) {
                    // Found the connection with the IP address to disable.
                    connectionToDisable = line;
                    break;
                }
            }

            // Close the reader and the list-connections process.
            reader.close();
            listProcess.waitFor();

            if (connectionToDisable != null) {
                // Disable the identified connection (replace with the actual command for your VPN client).
                ProcessBuilder disableConnectionProcess = new ProcessBuilder("sophosvpnclient", "--disconnect", connectionToDisable);
                Process disableProcess = disableConnectionProcess.start();

                // Wait for the process to finish.
                disableProcess.waitFor();

                System.out.println("VPN connection with IP 14.192.2.179 has been disabled.");
            } else {
                System.out.println("VPN connection with IP 14.192.2.179 not found.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


