package org.j8unit.repository.java.security.spec;

import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAMultiPrimePrivateCrtKeySpecClassTest
implements org.j8unit.repository.java.security.spec.RSAMultiPrimePrivateCrtKeySpecClassTests<RSAMultiPrimePrivateCrtKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.RSAMultiPrimePrivateCrtKeySpec]

    @Override
    public Class<RSAMultiPrimePrivateCrtKeySpec> createNewSUT() {
        return RSAMultiPrimePrivateCrtKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RSAMultiPrimePrivateCrtKeySpec#RSAMultiPrimePrivateCrtKeySpec(BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, RSAOtherPrimeInfo[])
     * public
     * java.security.spec.RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.math.BigInteger,java.security.spec.RSAOtherPrimeInfo[])}
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
    public void create_RSAMultiPrimePrivateCrtKeySpec_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_BigInteger_RSAOtherPrimeInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RSAMultiPrimePrivateCrtKeySpec sut = null; // = new RSAMultiPrimePrivateCrtKeySpec(BigInteger, BigInteger,
                                                         // BigInteger, BigInteger, BigInteger, BigInteger, BigInteger,
                                                         // BigInteger, RSAOtherPrimeInfo[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.RSAMultiPrimePrivateCrtKeySpec]

}
