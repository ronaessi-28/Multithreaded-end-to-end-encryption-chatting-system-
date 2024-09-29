import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 42000)) {
            System.out.println("Connected to the server.");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter message: ");
                String message = scanner.nextLine();

                // Encrypt message using RSA before sending
                String encryptedMessage = RSA.encrypt(message);
                out.println(encryptedMessage);

                String serverResponse = in.readLine();
                System.out.println("Received encrypted message: " + serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
