package org.j8unit.repository.javax.crypto;

import javax.crypto.CipherInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CipherInputStream} (by simply reusing the
 * J8Unit test interface {@link CipherInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class CipherInputStreamClassTest
implements CipherInputStreamClassTests<CipherInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.CipherInputStream]

    @Override
    public Class<CipherInputStream> createNewSUT() {
        return CipherInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.CipherInputStream#CipherInputStream(java.io.InputStream, javax.crypto.Cipher) public
     * javax.crypto.CipherInputStream(java.io.InputStream,javax.crypto.Cipher)}.
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
    public void create_CipherInputStream_InputStream_Cipher()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CipherInputStream sut = null; // = new CipherInputStream(java.io.InputStream, javax.crypto.Cipher);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.CipherInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.CipherInputStream]

}
