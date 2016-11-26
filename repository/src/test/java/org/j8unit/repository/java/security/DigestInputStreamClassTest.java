package org.j8unit.repository.java.security;

import java.security.DigestInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DigestInputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.DigestInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class DigestInputStreamClassTest
implements DigestInputStreamClassTests<DigestInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.DigestInputStream]

    @Override
    public Class<DigestInputStream> createNewSUT() {
        return DigestInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.DigestInputStream#DigestInputStream(java.io.InputStream, java.security.MessageDigest) public
     * java.security.DigestInputStream(java.io.InputStream,java.security.MessageDigest)}.
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
    public void create_DigestInputStream_InputStream_MessageDigest()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DigestInputStream sut = null; // = new DigestInputStream(java.io.InputStream,
                                            // java.security.MessageDigest);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.DigestInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.DigestInputStream]

}
