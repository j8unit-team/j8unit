package org.j8unit.repository.java.security.spec;

import java.security.spec.PKCS8EncodedKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKCS8EncodedKeySpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.spec.PKCS8EncodedKeySpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKCS8EncodedKeySpecClassTest
implements PKCS8EncodedKeySpecClassTests<PKCS8EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.PKCS8EncodedKeySpec]

    @Override
    public Class<PKCS8EncodedKeySpec> createNewSUT() {
        return PKCS8EncodedKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.PKCS8EncodedKeySpec#PKCS8EncodedKeySpec(byte[]) public
     * java.security.spec.PKCS8EncodedKeySpec(byte[])}.
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
    public void create_PKCS8EncodedKeySpec_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKCS8EncodedKeySpec sut = null; // = new PKCS8EncodedKeySpec(byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.PKCS8EncodedKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.PKCS8EncodedKeySpec]

}
