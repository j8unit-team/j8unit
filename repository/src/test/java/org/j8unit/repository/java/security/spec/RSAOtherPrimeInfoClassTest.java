package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAOtherPrimeInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAOtherPrimeInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.spec.RSAOtherPrimeInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class RSAOtherPrimeInfoClassTest
implements RSAOtherPrimeInfoClassTests<RSAOtherPrimeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.RSAOtherPrimeInfo]

    @Override
    public Class<RSAOtherPrimeInfo> createNewSUT() {
        return RSAOtherPrimeInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.RSAOtherPrimeInfo#RSAOtherPrimeInfo(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger)
     * public java.security.spec.RSAOtherPrimeInfo(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_RSAOtherPrimeInfo_BigInteger_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RSAOtherPrimeInfo sut = null; // = new RSAOtherPrimeInfo(java.math.BigInteger, java.math.BigInteger,
                                            // java.math.BigInteger);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.RSAOtherPrimeInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.RSAOtherPrimeInfo]

}
