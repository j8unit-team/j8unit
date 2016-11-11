package org.j8unit.repository.javax.crypto;

import javax.crypto.CipherOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CipherOutputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.CipherOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class CipherOutputStreamClassTest
implements CipherOutputStreamClassTests<CipherOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.CipherOutputStream]

    @Override
    public Class<CipherOutputStream> createNewSUT() {
        return CipherOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.CipherOutputStream#CipherOutputStream(java.io.OutputStream, javax.crypto.Cipher) public
     * javax.crypto.CipherOutputStream(java.io.OutputStream,javax.crypto.Cipher)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_CipherOutputStream_OutputStream_Cipher()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CipherOutputStream sut = null; // = new CipherOutputStream(java.io.OutputStream, javax.crypto.Cipher);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.CipherOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.CipherOutputStream]

}
