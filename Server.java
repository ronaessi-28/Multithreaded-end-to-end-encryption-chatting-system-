
---

### 2. `Server.java`

This file contains the main server class which handles connections from multiple clients using multithreading.

#### Example Code for `Server.java`:

```java
import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 42000;

    public static void main(String[] args) {
        System.out.println("Server is starting...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running at IP: " + InetAddress.getLocalHost().getHostAddress());
            System.out.println("Waiting for clients to connect...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }
                            
