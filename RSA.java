import java.math.BigInteger;
import java.util.Random;

public class RSA {
    private static BigInteger p, q, n, phi, e, d;
    private static final Random random = new Random();

    static {
        keyGenerator();
    }

    public static void keyGenerator() {
        p = BigInteger.probablePrime(512, random);
        q = BigInteger.probablePrime(512, random);
        n = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        
        e = new BigInteger("65537"); // Common public exponent
        d = e.modInverse(phi); // Private key exponent
    }

    public static String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(e, n).toString();
    }

    public static String decrypt(String encryptedMessage) {
        BigInteger cipherText = new BigInteger(encryptedMessage);
        return new String(cipherText.modPow(d, n).toByteArray());
    }
}
