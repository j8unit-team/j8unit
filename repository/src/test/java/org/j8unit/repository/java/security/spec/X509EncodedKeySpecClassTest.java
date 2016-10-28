package org.j8unit.repository.java.security.spec;

import java.security.spec.X509EncodedKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509EncodedKeySpecClassTest
implements org.j8unit.repository.java.security.spec.X509EncodedKeySpecClassTests<X509EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.X509EncodedKeySpec]

    @Override
    public Class<X509EncodedKeySpec> createNewSUT() {
        return X509EncodedKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link X509EncodedKeySpec#X509EncodedKeySpec(byte[])
     * public java.security.spec.X509EncodedKeySpec(byte[])}.
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
    public void create_X509EncodedKeySpec_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X509EncodedKeySpec sut = null; // = new X509EncodedKeySpec(byte[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.X509EncodedKeySpec]

}
