import java.security.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class KEMExample {
    public static void main(String[] args) throws Exception {
        // Generate key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        // Sender encapsulates the secret key
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        byte[] encapsulatedKey = cipher.doFinal(secretKey.getEncoded());

        // Receiver decapsulates the secret key
        Cipher decapsulationCipher = Cipher.getInstance("RSA");
        decapsulationCipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        byte[] decryptedKey = decapsulationCipher.doFinal(encapsulatedKey);

        // Compare original secret key and decrypted key
        SecretKey decryptedSecretKey = new SecretKeySpec(decryptedKey, "AES");
        boolean isEqual = secretKey.equals(decryptedSecretKey);
        System.out.println("Are keys equal? " + isEqual);
    }
}