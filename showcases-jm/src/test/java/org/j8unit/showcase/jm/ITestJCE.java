package org.j8unit.showcase.jm;

import javax.crypto.Cipher;
import org.junit.Assert;
import org.junit.Test;

public interface ITestJCE {

    @Test
    public default void testInstalledJCE()
    throws Exception {
        // If JCE unlimited strength jurisdiction policy files are
        // installed, Integer.MAX_VALUE will be returned.
        final int keyLength = Cipher.getMaxAllowedKeyLength("AES");
        Assert.assertEquals("Missing JCE!", Integer.MAX_VALUE, keyLength);
    }

}
