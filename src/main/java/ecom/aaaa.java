package ecom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class aaaa {

    public static void main(String[] args) {
        // Replace '14.192.2.179' with the actual IP address you want to disable
        String ipToDisable = "14.192.2.179";

        // Build the command to disable the network connection
        String[] command = {"C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "enable", "-n", ipToDisable};

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Capture the standard output and error streams of the process
            InputStream inputStream = process.getInputStream();
            InputStream errorStream = process.getErrorStream();

            // Create readers to read the streams
            final BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
            final BufferedReader errorReader = new BufferedReader(new InputStreamReader(errorStream));

            // Start separate threads to read and display the output
            Thread inputThread = new Thread(new Runnable() {
				@Override
				public void run() {
				    String line;
				    try {
				        while ((line = inputReader.readLine()) != null) {
				            System.out.println("Process Output: " + line);
				        }
				    } catch (IOException e) {
				        e.printStackTrace();
				    }
				}
			});

            Thread errorThread = new Thread(new Runnable() {
				@Override
				public void run() {
				    String line;
				    try {
				        while ((line = errorReader.readLine()) != null) {
				            System.err.println("Process Error: " + line);
				        }
				    } catch (IOException e) {
				        e.printStackTrace();
				    }
				}
			});

            // Start the threads to read output and error streams
            inputThread.start();
            errorThread.start();

            // Wait for the process to finish
            int exitCode = process.waitFor();

            // Wait for the input and error threads to finish (optional)
            inputThread.join();
            errorThread.join();

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
