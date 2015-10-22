package org.j8unit.showcase.jm;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class CryptoUtil {

    public static String encrypt(final String plain, final SecretKey key)
    throws Exception {
        return toBase64(encrypt(plain.getBytes(), key));
    }

    private static byte[] encrypt(final byte[] plain, final SecretKey key)
    throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        final Cipher cipher = Cipher.getInstance(key.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(plain);
    }

    private static String toBase64(final byte[] src) {
        final Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(src);
    }

    public static String decrypt(final String encrypted, final SecretKey key)
    throws Exception {
        return new String(decrypt(fromBase64(encrypted), key));
    }

    private static byte[] decrypt(final byte[] encrypted, final SecretKey key)
    throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        final Cipher cipher = Cipher.getInstance(key.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(encrypted);
    }

    private static byte[] fromBase64(final String src) {
        final Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(src);
    }

}
