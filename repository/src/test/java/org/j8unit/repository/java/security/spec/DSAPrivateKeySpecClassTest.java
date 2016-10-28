package org.j8unit.repository.java.security.spec;

import java.security.spec.DSAPrivateKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeySpecClassTest
implements org.j8unit.repository.java.security.spec.DSAPrivateKeySpecClassTests<DSAPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.DSAPrivateKeySpec]

    @Override
    public Class<DSAPrivateKeySpec> createNewSUT() {
        return DSAPrivateKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.DSAPrivateKeySpec#DSAPrivateKeySpec(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger)
     * public
     * java.security.spec.DSAPrivateKeySpec(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger)}
     * .
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
    public void create_DSAPrivateKeySpec_BigInteger_BigInteger_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DSAPrivateKeySpec sut = null; // = new DSAPrivateKeySpec(java.math.BigInteger, java.math.BigInteger,
                                            // java.math.BigInteger, java.math.BigInteger);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.DSAPrivateKeySpec]

}
