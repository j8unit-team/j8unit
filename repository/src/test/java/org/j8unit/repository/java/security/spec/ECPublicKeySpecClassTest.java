package org.j8unit.repository.java.security.spec;

import java.security.spec.ECPublicKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeySpecClassTest
implements org.j8unit.repository.java.security.spec.ECPublicKeySpecClassTests<ECPublicKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.ECPublicKeySpec]

    @Override
    public Class<ECPublicKeySpec> createNewSUT() {
        return ECPublicKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.ECPublicKeySpec#ECPublicKeySpec(java.security.spec.ECPoint, java.security.spec.ECParameterSpec)
     * public java.security.spec.ECPublicKeySpec(java.security.spec.ECPoint,java.security.spec.ECParameterSpec)}.
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
    public void create_ECPublicKeySpec_ECPoint_ECParameterSpec()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECPublicKeySpec sut = null; // = new ECPublicKeySpec(java.security.spec.ECPoint,
                                          // java.security.spec.ECParameterSpec);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.ECPublicKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.ECPublicKeySpec]

}
