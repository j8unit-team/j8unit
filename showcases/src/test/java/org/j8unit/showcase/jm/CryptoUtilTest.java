package org.j8unit.showcase.jm;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CryptoUtilTest
implements ITestJCE {

    @Test
    public void testStrongAES()
    throws Exception {
        final KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        // requires JCE!
        keyGen.init(256);

        final SecretKey key = keyGen.generateKey();

        final String plain = "Foobar";
        final String encrypted = CryptoUtil.encrypt(plain, key);
        final String decrypted = CryptoUtil.decrypt(encrypted, key);

        Assert.assertNotEquals(plain, encrypted);
        Assert.assertEquals(plain, decrypted);
    }
}
