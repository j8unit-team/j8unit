package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAMultiPrimePrivateCrtKeySpec} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.spec.RSAMultiPrimePrivateCrtKeySpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAMultiPrimePrivateCrtKeySpecClassTest
implements RSAMultiPrimePrivateCrtKeySpecClassTests<RSAMultiPrimePrivateCrtKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.RSAMultiPrimePrivateCrtKeySpec]

    @Override
    public Class<RSAMultiPrimePrivateCrtKeySpec> createNewSUT() {
        return RSAMultiPrimePrivateCrtKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.RSAMultiPrimePrivateCrtKeySpec#RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.security.spec.RSAOtherPrimeInfo[])
     * public
     * java.security.spec.RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.security.spec.RSAOtherPrimeInfo[])}.
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
    public void create_RSAMultiPrimePrivateCrtKeySpec_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_RSAOtherPrimeInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RSAMultiPrimePrivateCrtKeySpec sut = null; // = new RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger,
                                                         // java.math.BigInteger, java.math.BigInteger,
                                                         // java.math.BigInteger, java.math.BigInteger,
                                                         // java.math.BigInteger, java.math.BigInteger,
                                                         // java.math.BigInteger,
                                                         // java.security.spec.RSAOtherPrimeInfo[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.RSAMultiPrimePrivateCrtKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.RSAMultiPrimePrivateCrtKeySpec]

}
