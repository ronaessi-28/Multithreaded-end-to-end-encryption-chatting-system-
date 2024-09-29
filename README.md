
# Multithreaded End-to-End Encrypted Cryptography-Based Real-Time Chat Application

This Java-based chat application allows two clients to communicate securely via LAN or Wi-Fi using RSA encryption. The server facilitates connections but cannot decipher messages between clients.

## Features
- End-to-end encryption using RSA.
- Secure chat between two clients.
- Multithreaded server capable of handling multiple connections.

## Requirements
- Java 8 or higher.
- LAN or Wi-Fi for offline communication.

### Modules:
- `java.net.*` - Networking interface for sockets.
- `java.io.*` - Stream handling.
- `java.math.BigInteger` - Handles large integers for RSA encryption.
- `java.util.Random` - For prime number generation in RSA.

## Setup Instructions

1. Clone or download the repository:
   ```bash
   git clone https://github.com/username/Multithreaded-Encrypted-Chat.git
   ```
   
2. Navigate to the project folder:
   ```bash
   cd Multithreaded-Encrypted-Chat
   ```

3. Compile all Java files:
   ```bash
   javac *.java
   ```

4. First, run the `Server.java`:
   ```bash
   java Server
   ```

5. On separate systems, run `Client.java` for each client:
   ```bash
   java Client
   ```

6. Input the server IP and port (default: 42000), then enter your name.

7. Start chatting securely!

## Screenshots
- Server console:
  ![](screenshots/img1.png)

- Client 1 interface:
  ![](screenshots/img2.png)

- Client 2 interface:
  ![](screenshots/img3.png)

- Server console after a conversation:
  ![](screenshots/img4.png)

## How It Works
This project uses socket programming for communication between clients and RSA encryption to secure messages. Each client connects to the server, which facilitates message exchange without the ability to decrypt the content.

For RSA, two large prime numbers are generated, and keys are created. The public key is used to encrypt messages, and the private key decrypts them, ensuring end-to-end encryption.
