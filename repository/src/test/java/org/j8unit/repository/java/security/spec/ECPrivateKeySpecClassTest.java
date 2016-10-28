package org.j8unit.repository.java.security.spec;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPrivateKeySpecClassTest
implements org.j8unit.repository.java.security.spec.ECPrivateKeySpecClassTests<ECPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.ECPrivateKeySpec]

    @Override
    public Class<ECPrivateKeySpec> createNewSUT() {
        return ECPrivateKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ECPrivateKeySpec#ECPrivateKeySpec(BigInteger, ECParameterSpec) public
     * java.security.spec.ECPrivateKeySpec(java.math.BigInteger,java.security.spec.ECParameterSpec)}.
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
    public void create_ECPrivateKeySpec_BigInteger_ECParameterSpec()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECPrivateKeySpec sut = null; // = new ECPrivateKeySpec(BigInteger, ECParameterSpec);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.ECPrivateKeySpec]

}
